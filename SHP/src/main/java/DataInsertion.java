package main.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DataInsertion {

	// Insert Customer
    public int insertCustomer(int id, String name, String contact, String gender, String address, String city, String zipcode) throws SQLException {
        String query = "INSERT INTO Customer(cust_id, cust_name, cust_contact, cust_gender, cust_addr, city, zipcode) VALUES (?,?,?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, contact);
            ps.setString(4, gender);
            ps.setString(5, address);
            ps.setString(6, city);
            ps.setString(7, zipcode);

            int rows = ps.executeUpdate();
            System.out.println("Customer inserted successfully!");
            return rows; // return rows affected
        }
    }

    // Insert Product
    public int insertProduct(int pid, String code, String desc, double price, int qty, String expdate, int custId) throws SQLException {
    	
        String query = "INSERT INTO Product(product_id, product_code, product_desc, product_price, product_qty, product_expdate, cust_id) VALUES (?,?,?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, pid);
            ps.setString(2, code);
            ps.setString(3, desc);
            ps.setDouble(4, price);
            ps.setInt(5, qty);
            ps.setString(6, expdate);
            ps.setInt(7, custId);

            int rows = ps.executeUpdate();
            System.out.println("Product inserted successfully!");
            return rows; // return rows affected
        }
    }

}

