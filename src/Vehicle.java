
public class Vehicle {
	private String engine;
	private String wheels;
	private String seats;
	private String fuelTank;
	private String lights;

	public Vehicle(String engine, String wheels, String seats, String fuelTank, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}

	public Vehicle() {
		this.engine = "1";
		this.wheels = "2";
		this.seats = "3";
		this.fuelTank = "45";
		this.lights = "5";
	}

	public Vehicle(String toPasstoParent) {
		this.engine = toPasstoParent;
		this.wheels = "2";
		this.seats = "3";
		this.fuelTank = "45";
		this.lights = "5";
	}

	public void running()
	{
		System.out.println("vehicle running//");
	}
	
	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats + ", fuelTank=" + fuelTank
				+ ", lights=" + lights + "]";
	}

}
