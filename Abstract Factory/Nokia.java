package abstractfactory;

public class Nokia extends Device{
	private String ram;
	private String processor;
	
	public Nokia(String ramsize,String processorType) {
		this.ram=ramsize; 
		this.processor=processorType;
	}

	public String getDetails() {
		return "Nokia config is\nRam size: "+this.ram+"\nprocessor is: "+this.processor;
	}

	@Override
	public String toString() {
		return "Nokia [ram=" + ram + ", processor=" + processor + "]";
	}
	
}
