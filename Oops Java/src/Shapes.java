interface Shape
{
	public Double CalculateArea();
	public Double CalculateVolume();
}
class Circle implements Shape
{
	double r=3.2;
	public Double CalculateArea()
	{
		Double area=3.14*r*r;
		return area;
	}
	public Double CalculateVolume()
	{
		Double volume=(4/3)*3.14*r*r*r;
		return volume;
	}
}
class Square implements Shape
{
	double a=3;
	public Double CalculateArea()
	{
		Double area=a*a;
		return area;
	}
	public Double CalculateVolume()
	{
		Double volume=a*a*a;
		return volume;
	}
}
public interface Shapes {
	public static void main(String args[])
	{
		Shape i=new Circle();
		System.out.println(i.CalculateArea());
		System.out.println(i.CalculateVolume());
		
		i=new Square();
		System.out.println(i.CalculateArea());
		System.out.println(i.CalculateVolume());
	}

}
