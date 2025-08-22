package com.example;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.example.CustomListener;
import org.junit.jupiter.api.Disabled;   // ✅ JUnit 5 Disabled import

@Listeners(CustomListener.class)
public class MyTest {

    @Test
    public void testSuccess() {
        System.out.println("Executing testSuccess...");
    }

    @Test
    public void testFail() {
        System.out.println("Executing testFail...");
        assert false;
    }

    @Disabled
    @Test(enabled = false)   // ✅ JUnit 5 Disabled
    public void testSkipped() {
        System.out.println("This test will be skipped...");
        throw new SkipException("Skipping this test using SkipException");
    }
    
    @Test
    public void testConditionalSkip() {
        boolean dataAvailable = false;
        System.out.println("Test Case - Conditional Skip");
        if (!dataAvailable) {
            throw new SkipException("Skipping this test as data is not available");
        }
    }
    
}
