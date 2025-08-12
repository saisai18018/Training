package test.java;

import java.util.*;
import main.java.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest{
	
	@Test
	public void testExtractPortionOfArrayList() {
	    List<String> expected = Arrays.asList("Mumbai", "Chennai", "Hyderabad");
	    List<String> actual = ArrayExample.extractPortionOfArrayList();
	    assertEquals(expected, actual);
	}
}