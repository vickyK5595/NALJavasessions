package AssignmentAccessoModifiers;

public class Car {
	
	public void Model()
	{
		System.out.println("Model of the car");
	}
	private void Price()
	{
		System.out.println("Price of the car");
	}
	protected void Range()
	{
		System.out.println("Range of the car");
	}
	void Review()
	{
		System.out.println("Reviews of the car");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.Price();
		
	}
}
