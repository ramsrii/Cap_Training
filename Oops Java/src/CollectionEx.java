import java.util.*;
public class CollectionEx {
	public static void main(String args[])
	{
		List mylist=new ArrayList();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		System.out.println(mylist);
		System.out.println(mylist.contains(20));
		System.out.println(mylist.equals(45));
		System.out.println(mylist.get(0));
		System.out.println(mylist.indexOf(30));
		System.out.println(mylist.isEmpty());
		System.out.println(mylist.lastIndexOf(mylist));
		mylist.remove(0);
		System.out.println(mylist);
	
	}

}
