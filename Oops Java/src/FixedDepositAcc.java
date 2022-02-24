abstract class Acco
{
	abstract void bal();
	abstract void disp();
	void print()
	{
		System.out.println("print first");
	}
	void get()
	{

			System.out.println("get");
		}

}
class SavingAccount  extends Acco
{
	void bal()
	{
		System.out.println("Balance");
	}
	void disp()
	{
		System.out.println("display");
	}
	void print()
	{
		System.out.println("print");
	}
	
	
}

public class FixedDepositAcc {
	public static void main(String args[])
	{
		Acco a=new SavingAccount();
		a.bal();
		a.disp();
		a.print();
		a.get();
		
	}

}
