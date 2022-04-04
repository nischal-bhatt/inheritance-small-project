
public class VehicleMain {

	public static void main(String[] args) {

		Bike bike = new Bike();
		System.out.println(bike);

		Bike bike2 = new Bike("hehe");
		System.out.println(bike2);

		bike2.running(); //whose running method will be called?
	}

}
