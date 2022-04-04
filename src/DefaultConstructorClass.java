
public class DefaultConstructorClass {

	private int x;
	
	public DefaultConstructorClass()
	{
		System.out.println("creating - x will default to null");
	}
	
	public DefaultConstructorClass(int x)
	{
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
