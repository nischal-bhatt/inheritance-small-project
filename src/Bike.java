
public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		super();
		this.handle = "handle";
	}
	
	public Bike(String toPasstoParent)
	{
		super(toPasstoParent);
		this.handle= "hello";
	}
	
	public void running()
	{
		System.out.println("bile rim");
	}

	@Override
	public String toString() {
		return "Bike [handle=" + handle + "]" + super.toString();
	}

	
}
