package abstractfactory;

public class HP extends Device{
	private String ram;
	private String processor;
	private String gpu;
	
	public HP(String ramsize,String processorType,String gpuName) {
		this.ram=ramsize; 
		this.processor=processorType;
		this.gpu=gpuName;
	}

	public String getDetails() {
		return "HP config is:\n Ram Size: "+this.ram+"\nProcessor is: "+this.processor+"\nGPU : "+this.gpu;
	}

	@Override
	public String toString() {
		return "HP [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}
}
