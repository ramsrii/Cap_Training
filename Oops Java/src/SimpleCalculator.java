class BasicCalculator
{
	public int val1=11;
	public int val2=10;
	public void add()
	{
		int sum=val1+val2;
		System.out.println(sum);
	}
	public void sub()
	{
		int diff=val1-val2;
		System.out.println(diff);
	}
}
class ScientificCalc extends BasicCalculator
{
	public double calculateSin()
	{
		double sinval=Math.sin(val1);
		return sinval;
	}
	
	public double calCos()
	{
		double cosval=Math.cos(val1);
		return cosval;
	}
}
public class SimpleCalculator {
	public static void main(String args[])
	{
		ScientificCalc s=new ScientificCalc();
		s.add();
		s.sub();
		double sin=s.calculateSin();
		System.out.println(sin);
	}

}
