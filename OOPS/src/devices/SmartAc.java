package devices;

public class SmartAc implements SmartDevice, Adjustable{
	
	private boolean ison = false;
	
	private int temperature = 24;

	@Override
	public void increaseSetting() {
		// TODO Auto-generated method stub
		
		if (temperature < 30) {
            temperature++;
            System.out.println("Temperature increased to: " + temperature + "°C");
        }
		
	}

	@Override
	public void decreaseSetting() {
		// TODO Auto-generated method stub
		
		if (temperature > 16) {
            temperature--;
            System.out.println("Temperature decreased to: " + temperature + "°C");
        }
		
	}

	@Override
	public void changecolor() {
		// TODO Auto-generated method stub
		System.out.println("This device doesn't support color adjustment.");
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		ison = true;

		System.out.println("Ac has been turned on...");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		ison = false;

		System.out.println("Ac"
				+ " has been turned off...");

	}

}
