package test.java;

import main.java.StringExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    StringExample se = new StringExample();

    // Concatenation
    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", se.concatenate("Hello", "World"));
    }

    // Removing spaces
    @Test
    public void testRemoveSpaces() {
        assertEquals("HelloJavaWorld", se.removeSpaces("Hello Java World "));
    }

    // Counting characters
    @Test
    public void testCountCharacters() {
        assertEquals("Alphabets: 2, Digits: 1, Special characters: 1", se.countCharacters("ab2@"));
    }
    
    // max char
    @Test
    public void testmaxchar() {
    	assertEquals('s', se.maxChar("mississippi"));
    }
    
    // replace vowel
    @Test
    public void replacefirstvowel() {
    	assertEquals("m-ssissippi", se.replaceFirstVowel("mississippi"));
    }
}
