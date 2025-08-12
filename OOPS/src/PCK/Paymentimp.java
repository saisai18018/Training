package PCK;

public class Paymentimp {
	public static void main(String[] args) {
		
		Credit c = new Credit();
		Paypal p = new Paypal();
		
		c.makepayment(1000);
		p.makepayment(2154);
	}
	

}
