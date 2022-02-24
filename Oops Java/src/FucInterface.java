
interface  abc
{
	void add(int a,int b);
}
/*class bca implements abc
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}*/

public interface FucInterface {
public static void main(String args[])
{
	int aa=10;
	int bb=20;
	//abc n=(a,b)->System.out.println(a+b);                   //lamba expression
	//n.add(aa,bb);                                         
	
	//abc m=new bca();
	//m.add(aa, bb);
	
	abc a=new abc()
			{
				public void add(int a,int b)
				{
					System.out.println(a+b);
				}
			};
			a.add(aa, bb);
	
	
	
	
	
	
}
}
