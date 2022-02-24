interface stack
{
	void push(int x);
	int pop();
	void peep();
	
}
public class StackEx implements stack{
	int a[]=new int[5];
	int top=-1;
public void push(int x)
{
	if(top==5)
	{
		System.out.println("stack overflow");
	}
	else
	{
		a[++top]=x;
	}
}
public int pop()
{
	if(top==-1)
	{
		
		return -1;
	}
	else
		return  a[top--];
}
public void peep()
{
	System.out.println(a[top]);
}
public void disp()
{
	for(int i=0;i<=top;i++)
	{
		System.out.println(a[i]);
	}
}
public static void main(String args[])
{
	StackEx st_one=new StackEx();
	st_one.push(10);
	st_one.push(20);
	st_one.push(30);
	st_one.peep();
	st_one.pop();
	st_one.disp();
	StackEx st_two=new StackEx();
	st_two.push(100);
	st_two.push(200);
	st_two.push(300);
	st_two.peep();
	
}
}