package app;

import controller.DeviceController;
import devices.Adjustable;
import devices.SmartDevice;
import devices.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeviceController controller = new DeviceController();

        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();
        SmartDevice ac = new SmartAc();
        SmartDevice tv = new SmartTv();

        controller.powerOn(light);
        controller.increaseSetting(light);
        controller.decreaseSetting(light);
        controller.powerOff(light);
        controller.changecolor(light);

        System.out.println();

        controller.powerOn(fan);
        controller.increaseSetting(fan);
        controller.decreaseSetting(fan);
        controller.powerOff(fan);
        controller.changecolor(fan);
        
        System.out.println();

        controller.powerOn(ac);
        controller.increaseSetting(ac);
        controller.decreaseSetting(ac);
        controller.powerOff(ac);
        controller.changecolor(ac);

        System.out.println();

        controller.powerOn(tv);
        controller.increaseSetting(tv);
        controller.decreaseSetting(tv);
        controller.powerOff(tv);
        controller.changecolor(tv);
	}

}
