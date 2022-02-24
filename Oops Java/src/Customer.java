
public class Customer {
		int phonum,age;
		String cname;
		String address;
		
		void modify()
		{
			
		}
		Customer()
		{
			
		}
		Customer(int p,int a,String c, String addr)  //constructor
		{
			phonum=p;
			age=a;
			cname=c;
			address=addr;
		}
		void getCustomer()
		{
			System.out.println("phonumber="+phonum+"age="+age+"name="+cname+"Address="+address);
		}
		public static void main(String args[])
		{
			Customer c=new Customer(1001,34,"Ram","chennai");
			Customer cu=new Customer(1002,56,"hd","mumbai");
			c.getCustomer();
			System.out.println(c.toString());
		}




}
