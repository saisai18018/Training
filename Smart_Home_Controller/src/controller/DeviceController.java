package controller;

import devices.Adjustable;
import devices.SmartDevice;

public class DeviceController {

	public void powerOn(SmartDevice device) {
		device.turnOn();
	}

	public void powerOff(SmartDevice device) {
		device.turnOff();
	}

	public void changecolor(SmartDevice device) {
		if (device instanceof Adjustable) {
			((Adjustable) device).changecolor();
		} else {
			System.out.println("This device does not support adjustments");
		}
	}


	
	public void increaseSetting(SmartDevice device) {
		if (device instanceof Adjustable) {
			((Adjustable) device).increaseSetting();
		} else {
			System.out.println("This device does not support adjustments.");
		}
	}
	
	
	public void decreaseSetting(SmartDevice device) {
		if (device instanceof Adjustable) {
			((Adjustable) device).decreaseSetting();
		} else {
			System.out.println("This device does not support adjustments.");
		}
	}
}