package main.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopOperations {

	// Buy product
    public void buyProduct(int custId, int productId, int qty) throws SQLException {
        String updateStock = "UPDATE Product SET product_qty = product_qty - ? WHERE product_id = ? AND product_qty >= ?";
        String insertPurchase = "INSERT INTO CustomerPurchases(cust_id, product_id, qty_purchased) VALUES (?,?,?)";

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false); // start transaction

            try (PreparedStatement ps1 = con.prepareStatement(updateStock);
                 PreparedStatement ps2 = con.prepareStatement(insertPurchase)) {

                // 1. Reduce stock
                ps1.setInt(1, qty);
                ps1.setInt(2, productId);
                ps1.setInt(3, qty);
                int rows = ps1.executeUpdate();

                if (rows > 0) {
                    // 2. Record purchase
                    ps2.setInt(1, custId);
                    ps2.setInt(2, productId);
                    ps2.setInt(3, qty);
                    ps2.executeUpdate();

                    con.commit();
                    System.out.println("Purchase successful!");
                } else {
                    con.rollback();
                    System.out.println("Purchase failed (not enough stock).");
                }
            } catch (Exception e) {
                con.rollback();
                throw e;
            } finally {
                con.setAutoCommit(true);
            }
        }
    }

    // Display customer purchases
    public void displayCustomerProducts(int custId) throws SQLException {
        String sql = "SELECT c.cust_name, p.product_desc, p.product_price, cp.qty_purchased " +
                     "FROM Customer c " +
                     "JOIN CustomerPurchases cp ON c.cust_id = cp.cust_id " +
                     "JOIN Product p ON cp.product_id = p.product_id " +
                     "WHERE c.cust_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, custId);
            ResultSet rs = ps.executeQuery();

            double total = 0;
            System.out.println("Customer Purchases:");
            while (rs.next()) {
                String name = rs.getString("cust_name");
                String desc = rs.getString("product_desc");
                double price = rs.getDouble("product_price");
                int qty = rs.getInt("qty_purchased");
                total += price * qty;

                System.out.println("Customer: " + name +
                        " | Product: " + desc +
                        " | Price: " + price +
                        " | Qty Purchased: " + qty);
            }
            System.out.println("Total Spent = " + total);
        }
    }
}

