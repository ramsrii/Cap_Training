package Testone;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Testing.EBill;
public class EBillTest {
	EBill obj;
	
	@Test
	
	public void FirstifTest()
	{
		obj=new EBill(10);
		assertEquals(26.0, obj.calculateBillAmount(),2.0);
		
	}
	
	@Test
	public void SecondifTest() {
	obj=new EBill(60);
	assertEquals(324.75,obj.calculateBillAmount(),2.0);}
	
	@Test
	public void ThirdifTest() {
	obj=new EBill(110);
	assertEquals(345.1,obj.calculateBillAmount(),2.0);}
	
	
	
	

}
