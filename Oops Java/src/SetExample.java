import java.util.*;
public class SetExample
{
	public static void main(String[] args) {
		Set<String> ss=new LinkedHashSet<String>();
		ss.add("3");
		ss.add("1");
		ss.add("4");
		ss.add("2");
		ss.add("3");
		ArrayList<String> al=new ArrayList<String>();
		al.add("3");
		al.add("1");
		al.add("4");
		al.add("2");
		al.add("3");
		
		ss.add("5");
		ss.containsAll(al);
		ss.equals(al);
		ss.remove(2);
		

		Set<String> ss1=new TreeSet<String>(ss);
		Set<String> ss2=new TreeSet<String>(al);
		ArrayList<String> al2=new ArrayList<String>(ss2);
		System.out.println(ss);
		System.out.println(ss1);
		System.out.println(al);
		System.out.println(ss2);
		System.out.println(al2);
		//iterator
		Iterator<String> i=ss.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		//for each
		for(String s:ss)
			System.out.println(s);
	}
}

