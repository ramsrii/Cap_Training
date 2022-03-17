package Testone;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Testing.ArithmeticOperations;
public class ArithmeticOperationsTest {
	ArithmeticOperations obj;
	
	@Test
	public void addTest()
	{
		obj=new ArithmeticOperations(10,20);
		assertEquals(30,obj.add());
	}
	@Test
	public void subTest()
	{
		obj=new ArithmeticOperations(10,20);
		assertEquals("Test passed",-10,obj.sub());
	}
	
}
