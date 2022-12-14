package abstraction2;

class Car implements Ola
{
	public void ride()
	{
		System.out.println("ride in car");
	}
}
class bike implements Ola
{
	public void ride()
	{
		System.out.println("ride in Bike");
	}	
}
class Auto implements Ola
{
	public void ride()
	{
		System.out.println("ride with auto");
	}	
}
class Stimulator
{
	static void Veh_ride(Ola O1)
	{
		O1.ride();
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
	    Auto A1=new Auto();
		Car C1=new Car();
		bike B1=new bike();
	    Stimulator.Veh_ride(A1);
	    Stimulator.Veh_ride(B1);
	    Stimulator.Veh_ride(C1);
	}
}

