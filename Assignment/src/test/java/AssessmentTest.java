package test.java;

import main.java.Assessment;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

public class AssessmentTest {

    static Assessment assess; 
    static Connection con;

    @BeforeEach
    public void setUp() throws Exception {
        assess = new Assessment();
        assess.connect(); 
        System.out.println("Connection created....");
    }

    @Test
    @DisplayName("Test Insert Student - Sai")
    public void testInsertStudent() throws Exception {
        int result = assess.insertStudent(1, "Sai");
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Test Update Student - Bharath to Divya")
    public void testUpdateStudent() throws Exception {
        assess.insertStudent(2, "Bharath");
        int result = assess.updateStudent(2, "Divya");
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Test Delete Student - Meghu")
    public void testDeleteStudent() throws Exception {
        assess.insertStudent(3, "Meghu");
        int result = assess.deleteStudent(3);
        assertEquals(1, result);
    }

    
    @Test
    @Disabled("This test is disabled for demo purposes")
    @DisplayName("Disabled Test Example")
    public void disabledTest() {
        fail("This test should not run");
    }
    
    
    @AfterEach
    public void closing() throws Exception {
        assess.closing();
        System.out.println("Connection is closed.....");
    }
}