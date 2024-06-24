package abstractfactory;

public class LaptopFactory extends AbstractDeviceFactory{
	Device getGadget(DeviceType deviceType) {
		switch(deviceType) {
		case HP:
			return new HP("8gb", "Intel", "NVDIA");
		case DELL:
			return new Dell("12gb", "AMD", "NVIDIA");
		
		}
			
		return null;
			
	}
}