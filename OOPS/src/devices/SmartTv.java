package devices;

public class SmartTv implements SmartDevice, Adjustable{
	
	private boolean ison = false;

	private int volume = 10;
	
	@Override
	public void increaseSetting() {
		// TODO Auto-generated method stub
		
		if (volume < 100) {
            volume += 5;
            System.out.println("TV volume increased to: " + volume);
        }
		
	}

	@Override
	public void decreaseSetting() {
		// TODO Auto-generated method stub
		
		if (volume > 0) {
            volume -= 5;
            System.out.println("TV volume decreased to: " + volume);
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

		System.out.println("Tv has been turned on...");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		ison = false;

		System.out.println("Tv has been turned off...");

	}
}
