package main.java;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataInsertion insert = new DataInsertion();
        ShopOperations ops = new ShopOperations();

        while (true) {
            System.out.println("\n========= SHOP MENU =========");
            System.out.println("1. Insert Customer");
            System.out.println("2. Insert Product");
            System.out.println("3. Buy Product");
            System.out.println("4. Display Customer Products");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Customer ID: ");
                        int cid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Mobile: ");
                        String mobile = sc.nextLine();
                        System.out.print("Enter Gender (Male/Female/Other): ");
                        String gender = sc.nextLine();
                        System.out.print("Enter Street: ");
                        String street = sc.nextLine();
                        System.out.print("Enter City: ");
                        String city = sc.nextLine();
                        System.out.print("Enter Pincode: ");
                        String pin = sc.nextLine();

                        insert.insertCustomer(cid, name, mobile, gender, street, city, pin);
                        break;

                    case 2:
                        System.out.print("Enter Product ID: ");
                        int pid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Product Code: ");
                        String pcode = sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        String pname = sc.nextLine();
                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
                        String exp = sc.nextLine();
                        System.out.print("Enter Shop ID: ");
                        int sid = sc.nextInt();

                        insert.insertProduct(pid, pcode, pname, price, qty, exp, sid);
                        break;

                    case 3:
                        System.out.print("Enter Customer ID: ");
                        int bcust = sc.nextInt();
                        System.out.print("Enter Product ID: ");
                        int bprod = sc.nextInt();
                        System.out.print("Enter Quantity: ");
                        int bqty = sc.nextInt();

                        ops.buyProduct(bcust, bprod, bqty);
                        break;

                    case 4:
                        System.out.print("Enter Customer ID: ");
                        int dCust = sc.nextInt();
                        ops.displayCustomerProducts(dCust);
                        break;

                    case 5:
                        System.out.println("Exiting... Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
