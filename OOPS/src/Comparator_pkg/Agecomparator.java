package Comparator_pkg;

import java.util.*;

public class Agecomparator implements Comparator<StudentEx>{
	
	public int compare(StudentEx s1,StudentEx s2) {
		return Integer.compare(s1.getage(),s2.getage());
	}

	
}
