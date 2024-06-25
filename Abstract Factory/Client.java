package abstractfactory;

public class Client {
	public static void main(String args[]) {
		System.out.println("Moksha Dave 22BCP366");
		Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
		System.out.println(dell.getDetails());
		Device op=FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getGadget(DeviceType.ONEPLUS);
		System.out.println(op.getDetails());
	}
}
