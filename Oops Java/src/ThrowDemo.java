
public class ThrowDemo {
	public static void main(String args[])
	{
		int res=0;
		try
		{
			int den=Integer.parseInt(args[0]);
			System.out.println(3/den);
			System.out.println("statement skips");
			
		}
		catch(ArithmeticException a)
		{		
			System.out.println("Arthimetic exception is thrown");
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayOutOfBoundsException");
		}
		finally
		{
			System.out.println("Nobody can stop me");
		}
	}

}
