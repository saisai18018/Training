package Comparator_pkg;

import java.util.*;

public class NameComparator implements Comparator<StudentEx>{
	
	public int compare(StudentEx s1,StudentEx s2) {
		
		return s1.getname().compareTo(s2.getname());
	}

}
