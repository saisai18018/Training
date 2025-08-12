package PCK;

public class OrderGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order physical = new PhysicalProductOrder("P12");
		Order digital = new DigitalProductOrder("D34");
		Order service = new ServiceOrder("S56");
		
		physical.process_order();
		physical.print_order_summary();
		
		
		digital.process_order();
		digital.print_order_summary();
		
		service.process_order();
		service.print_order_summary();
		
	}

}
