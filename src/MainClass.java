
public class MainClass {

	public static void main(String[] args) {
		Student adam = new Student();
		adam.setName("adam");
		adam.setId(33);
		System.out.println(adam);
		
		System.out.println(adam.study("java book"));

		Car car = new Car("rolla");
		System.out.println(car.getDoor().length());
		
		//System.out.println(car.getTyre().length()); //null pointer exception - why?
	    //cos tyre is not initialized with a string and hence it is null- initialize it in constructor
		System.out.println(car.getTyre().length()); //now no null pointer exception
	
		//DefaultConstructorClass dcc = new DefaultConstructorClass();
	//above got compile time error --> why ? coz by adding a constructor of ur own, you have eliminated the default constructor
		
		DefaultConstructorClass dcc 
		= new DefaultConstructorClass();
		
		System.out.println(dcc.getX());
		
		DefaultConstructorClass dcc1
		= new DefaultConstructorClass(3);
		
		System.out.println(dcc1.getX());
	}

}
