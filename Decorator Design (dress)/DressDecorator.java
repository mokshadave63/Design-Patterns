package decorator2;

public class DressDecorator implements Dress{

	protected Dress dress;
	
	public DressDecorator (Dress c) {
		this.dress=c;
	}
	
	public void assemble() {
		this.dress.assemble();
	}
	
}