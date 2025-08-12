package devices;

public class SmartLight implements SmartDevice, Adjustable {

	private boolean ison = false;

	private String color = "Red";
	
	private int brightness = 5;

	@Override
	public void increaseSetting() {
		// TODO Auto-generated method stub
		if (brightness < 10) {
			
            brightness++;
            
            System.out.println("Brightness increased to: " + brightness);
        }

	}

	@Override
	public void decreaseSetting() {
		// TODO Auto-generated method stub
		if (brightness > 0) {
			
            brightness--;
            
            System.out.println("Brightness decreased to: " + brightness);
        }

	}

	@Override
	public void changecolor() {
		// TODO Auto-generated method stub
		if (!ison) {

			System.out.println("Changing color to green...!");

		} else {

			System.out.println("Light is off can't change the color....");

		}

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		ison = true;

		System.out.println("Light has been turned on...");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		ison = false;

		System.out.println("Light has been turned off...");

	}

}
