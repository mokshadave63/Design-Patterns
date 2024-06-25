package abstractfactory;

public abstract class FactoryGenerator {
	public static AbstractDeviceFactory getFactory(FactoryType fType) {
	switch(fType) {
			case LAPTOPFACTORY: 
				return new LaptopFactory (); 
			case MOBILEFACTORY: 
				return new MobileFactory();
	}
	return null;
	}
			
}
