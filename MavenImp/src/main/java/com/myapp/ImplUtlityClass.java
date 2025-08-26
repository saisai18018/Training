package com.myapp;

import com.myapp.UtilityClass;

class ImplUtlityClass{
	public static void main(String[] args){
		int result =  UtilityClass.add(1,1);
		System.out.println("Addition is: "+ result);
		int result2 = UtilityClass.sub(2, 1);
		System.out.println("Subtraction is: "+ result2);
		int result3 = UtilityClass.sub(2, 1);
		System.out.println("Multiplication is: "+ result3);
		int result4 = UtilityClass.sub(2, 1);
		System.out.println("Division is: "+ result4);
	}
}
