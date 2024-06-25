package abstractfactory;

public class Dell extends Device{
	private String ram;
	private String processor;
	private String gpu;
	
	public Dell(String ramsize,String processorType,String gpuName) {
		this.ram=ramsize; 
		this.processor=processorType;
		this.gpu=gpuName;
	}

	public String getDetails() {
		return "Dell config is:\nRam Size: "+this.ram+"\nProcessor is: "+this.processor+"\nGPU : "+this.gpu;
	}

	@Override
	public String toString() {
		return "Dell [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}
}
