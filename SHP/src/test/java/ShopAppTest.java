package test.java;

import main.java.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

public class ShopAppTest {

    private DataInsertion dao;
    private ShopOperations ops;

    @BeforeEach
    void setup() {
        dao = new DataInsertion();
        ops = new ShopOperations();
        System.out.println("Setting up before test...");
    }

    @AfterEach
    void cleanup() {
        dao = null;
        ops = null;
        System.out.println("Cleaning up after test...");
    }

    @Test
    void testInsertCustomer() throws Exception {
        int rowsInserted = dao.insertCustomer(
            101, "Divya", "9703227644", "Female",
            "Street 123", "Anantapur", "515001"
        );
        assertEquals(1, rowsInserted, "Customer should be inserted successfully");
    }

    @Test
    void testInsertProduct() throws Exception {
        int rowsInserted = dao.insertProduct(
            201, "P001", "Mobile", 25000.21,
            10, "2025-12-31", 101
        );
        assertEquals(1, rowsInserted, "Product should be inserted successfully");
    }

    @Test
    void testBuyProduct() throws SQLException {
        ops.buyProduct(1, 1, 2);
        assertTrue(true);
    }

    @Test
    void testDisplayCustomerProducts() throws SQLException {
        ops.displayCustomerProducts(1);
        assertTrue(true);
    }
}
