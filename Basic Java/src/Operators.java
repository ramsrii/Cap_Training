
public class Operators {
	public static void main(String args[])
	{
		int a=20;
		int b=10;
		int c;
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
		c=a%b;
		System.out.println(c);
		
		a=30;
		
		c=++a;
		System.out.println(c);
		c=a++;
		System.out.println(c);
		c=--b;
		System.out.println(c);
		c=b--;
		System.out.println(c);
		
		System.out.println("Relational op");
		
		a = 7;
		b = 11;

	    // value of a and b
	    System.out.println("a is " + a + " and b is " + b);

	    // == operator
	    System.out.println(a == b);  // false

	    // != operator
	    System.out.println(a != b);  // true

	    // > operator
	    System.out.println(a > b);  // false

	    // < operator
	    System.out.println(a < b);  // true

	    // >= operator
	    System.out.println(a >= b);  // false

	    // <= operator
	    System.out.println(a <= b);  // true
	    
	    System.out.println("logical op");
		
	    
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    
	    System.out.println("Bitwise op");
	    
	    int d=9;
	    int e=8;
	    
	    System.out.println("d & e = " + (d & e));   
	    System.out.println("d | e = " + (d | e));
	    System.out.println("d ^ e = " + (d ^ e));
	    System.out.println("~d = " + (~d));
	    
	    System.out.println("Assignment op");
	    
	    int f=0;
	    int g=3;
	    f+=g;
	    System.out.println(f);
	    f%=g;
	    System.out.println(f);
	    
	    
		
		
		
	}
}
