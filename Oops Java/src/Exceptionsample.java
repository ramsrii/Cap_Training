
public class Exceptionsample {
	public static void main(String[] args) {
		
		
		Exceptionsample obj=new Exceptionsample();
		try
		{
			
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		catch(Exception e)
		{
			System.out.println("common exception");
		}
		finally
		{
			System.out.println("hello");
			obj.exceptionsam();
		}
		
		
		
	}
	void exceptionsam() throws ArrayIndexOutOfBoundsException
	{
		int a[]=new int[2];
		a[0]=4;
		a[1]=0;
		System.out.println(a[0]/a[1]);
	}
	

}
