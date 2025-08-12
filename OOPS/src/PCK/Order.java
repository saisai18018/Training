package PCK;

abstract class Order {
	protected String order_id;

	public Order(String order_id) {
		this.order_id = order_id;
	}

	public abstract void process_order();

	public void print_order_summary() {
		System.out.println("order " + order_id + "summary");
	}
}

// physical orders

//class PhysicalProductOrder extends Order {
//	public PhysicalProductOrder(String order_id) {
//		super(order_id);
//	}
//
//	@Override
//	public void process_order() {
//		System.out.println("Shipping physical product for order " + order_id + ".");
//	}
//}
//
////  digital orders
//
//class DigitalProductOrder extends Order {
//	public DigitalProductOrder(String order_id) {
//		super(order_id);
//	}
//
//	@Override
//	public void process_order() {
//		System.out.println("Sending download link for order " + order_id + ".");
//	}
//}
//
//// service orders
//
//class ServiceOrder extends Order {
//	public ServiceOrder(String order_id) {
//		super(order_id);
//	}
//
//	@Override
//	public void process_order() {
//		System.out.println("Scheduling service for order " + order_id + ".");
//	}
//}
