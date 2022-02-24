interface Vehicle
{  
	void drive();
	void turnLeft();
	void brake();
} 
interface PublicTransport 
{
	void getNumberOfPeople();
}
interface AdvVehicle extends Vehicle
{
	public void accelerate();
}
class MotorizedVehicle
{  
   void checkMotor()
   {
   	System.out.println("good cond");
   }
}
class raceCar implements AdvVehicle
{
	public void drive()
	   { 
	   	System.out.println("Car in drive mode");
	   }
	   public void turnLeft()
	   {
	   	System.out.println("Car in Left mode");
	   }
	   public void brake()
	   {
	   	System.out.println("Car in brake mode");
	   }
	   public void accelerate()
	   {
		   System.out.println("Accelerated");
	   }
}
class Car extends MotorizedVehicle implements Vehicle
{  
   public void drive()
   { 
   	System.out.println("Car in drive mode");
   }
   public void turnLeft()
   {
   	System.out.println("Car in Left mode");
   }
   public void brake()
   {
   	System.out.println("Car in brake mode");
   }

}
class trains implements Vehicle,PublicTransport
{
	public void drive()
   {
   	System.out.println("Train in drive mode");
   }
   public void turnLeft()
   {
   	System.out.println("Train in Left mode");
   }
   public void brake()
   {
   	System.out.println("Train in brake mode");
   }
   public void getNumberOfPeople()
   {
	   int people=4;
	   System.out.println(people);
   }
}

public interface Vehicles {
	public static void main(String[] args) {
    	Vehicle cc=new Car();
    	cc.drive();
    	cc.brake();
    	Car c=new Car();
    	c.checkMotor();
    	Vehicle tt=new trains();
    	tt.brake();
    	tt.drive();
    	PublicTransport p=new trains();
    	p.getNumberOfPeople();
    	AdvVehicle vv= new raceCar();
    	vv.accelerate();
    	MotorizedVehicle mv=new Car();
    	mv.checkMotor();
    	
    	
    			
    	

}
}
