abstract class Vehicle
{
	abstract void start();	
}
	

class Car extends Vehicle
{
	@Override
	 void start() 
	 {
		 System.out.println("car starts with key");
	}
}

class Scooter extends Vehicle
{
	@Override
	void start() 
	{
		System.out.println("Scoter starts with key");	
	}
	public static void main (String[] args)
	{
		Car c=new Car();
		c.start();
		
		Scooter s=new Scooter();
		s.start();
	}
	
}