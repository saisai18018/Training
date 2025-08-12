package devices;

public class SmartFan implements SmartDevice, Adjustable{
	
	private boolean ison = false;
	
	private int speed = 2;

	@Override
	public void increaseSetting() {
		// TODO Auto-generated method stub
		
		if (speed < 5) {
            speed++;
            System.out.println("Fan speed increased to: " + speed);
        }
		
	}

	@Override
	public void decreaseSetting() {
		// TODO Auto-generated method stub
		
		if (speed > 1) {
            speed--;
            System.out.println("Fan speed decreased to: " + speed);
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

		System.out.println("Fan has been turned on...");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		ison = false;

		System.out.println("Fan has been turned off...");

	}

}
