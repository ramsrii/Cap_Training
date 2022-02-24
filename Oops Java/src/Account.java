class Acc
{
	int acc_no=101;
	float balance;
	Acc(float balance)
	{
		this.balance=balance;
	}
	
	void display() {
		System.out.println("Account no:"+acc_no+"\n Balance: "+balance);
		
	}
}
class Saving extends Acc
{
	Saving(float balance)
	{
		super(balance);
		
	}
	int interest=10;
	void display()
	{
		balance=balance+(balance*10)/100;
		System.out.println("Balance= "+balance);
		}
}
class Fixed extends Acc
{
	float p,n,r;
	
	Fixed(float p,float n,float r)
	{
		super(p);
		this.p=p;
		this.n=n;
		this.r=r;
	}
	void display()
	{
		balance=balance+(p*n*r)/100.0f;
		System.out.println("\nBalance= "+balance);
		
	}
}
public class Account {
	public static void main(String args[])
	{
		Fixed f=new  Fixed(100,2,10);
		Saving s=new Saving(1000);
		f.display();
		s.display();
	}

}
