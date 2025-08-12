package Wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;

		Integer obj = Integer.valueOf(x); // Manual boxing

		System.out.println(obj);

		int x1 = obj.intValue(); // manual unboxing

		System.out.println(x1);

		///////////////////////////////////////////////////////////////////////////

		Integer ibox = x; // auto-boxing

		System.out.println(ibox);

		int ubox = ibox; // auto-unboxing

		System.out.println(ubox);

		///////////////////////////////////////////////////////////////////////////

		// Constructors

		Integer intObj = new Integer(10);// Deprecated

		System.out.println("Deprecated using Constructor: " + intObj);

		// Use valueOf() method

		Integer vintObj = Integer.valueOf(10);

		System.out.println("Use valueOf() method instead: " + vintObj);

		String str = "100";

		int istr = Integer.parseInt(str);

		System.out.println("Convert a string to an integer: " + (istr + 100));

		// Returns the primitive value of the object.

		Integer objInt = 300;

		int primInt = objInt.intValue();

		System.out.println("The int value for a wrapperclass object: " + primInt);

		// floating type wrapper class object

		Float objFloat = 23.45f;

		float primFloat = objFloat.floatValue();

		System.out.println("The float value for a wrapperclass object: " + primFloat);

		// compareTo()

		// returns 0 when 2 wrapper class objects are equal.

		// returns 1 if first WC object is greater than the second.

		// returns -1 if first WC object is less than the second

		Integer a = 100;

		Integer b = 100;

		int result = a.compareTo(b); // returns -1 (because 10 < 20)

		System.out.println("Comapring 2 wrapper class objects: " + result);

		// equals(Object obj)

		// Checks for value equality.

		Integer obj1 = 100;

		Integer obj2 = 100;

		System.out.println("Checks value equality for WC objects: " + (obj1.equals(obj2)));

		// toString() - Converts the object to a String.

		Integer a1 = 50;

		String s = a1.toString(); // "50"

		System.out.println("Converting the WC object to a String value: " + (s + 100));

		// isLetter()

		char c = 'A';

		System.out.println(Character.isLetter(c)); // true

		// isDigit()

		char ch = '2';

		System.out.println(Character.isDigit(ch));

		char theChar = 'V';

		char lCase = Character.toLowerCase(theChar);

		System.out.println("To LowerCase: " + lCase);

		char uCase = Character.toUpperCase(theChar);

		System.out.println("To UpperCase: " + uCase);
		
		
		//// Boolean implementation
		
		String string = "true";
		

        boolean bparse = Boolean.parseBoolean(string);
        
        System.out.println("Boolean.parseBoolean(\"Sai\"): " + bparse); 

        
        Boolean boolObj = Boolean.valueOf(string);
        
        System.out.println("Boolean.valueOf(\"Sai\"): " + boolObj); 

        
        boolean val1 = boolObj.booleanValue();
        
        System.out.println("boolObj.booleanValue(): " + val1); 
		

	}

}
