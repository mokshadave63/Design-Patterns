package abstractfactory;

public class OnePlus extends Device{
	private String ram;
	private String processor;
	
	public OnePlus(String ramsize,String processorType) {
		this.ram=ramsize; 
		this.processor=processorType;
	}

	public String getDetails() {
		return "OnePlus config is\nRam size: "+this.ram+"\nProcessor is: "+this.processor;
	}

	@Override
	public String toString() {
		return "OnePlus [ram=" + ram + ", processor=" + processor + "]";
	}
	
}