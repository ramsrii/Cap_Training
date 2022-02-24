
public class String1 {
	public static void main(String args[])
	{
		/*String s1=new String();
		char chars[]= {'h','e','l','l','o'};
		String s2=new String(chars);
		String s3=new String(chars,1,3);
		String s4=new String(s2);
		String s5=s2;
	
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);*/
		
	/*	String name="Ram";
		System.out.println(name);
		System.out.println(name.charAt(1));
		System.out.println(name.compareTo("sri"));
		System.out.println(name.equals("sri"));
		System.out.println(name.length());
		System.out.println(name.replace('R', 'r'));
		System.out.println(name.indexOf('m'));
		System.out.println(name.substring(0, 2));  */
		
		StringBuffer str=new StringBuffer("hello");
		System.out.println(str.length());
		System.out.println(str.append("world"));
		System.out.println(str.insert(5,"_java "));
		System.out.println(str.reverse());
		System.out.println(str.deleteCharAt(3));
		System.out.println(str.capacity());
		
		
		
		
		
	}

}
