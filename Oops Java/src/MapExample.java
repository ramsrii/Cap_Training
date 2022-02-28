import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> mi=new LinkedHashMap<Integer,String>();
		mi.put(3,"Nayan");
		mi.put(2,"samantha");
		mi.put(1,"raashmika");
		
		boolean hasValue=mi.containsValue("Nayan");
		boolean hasKey=mi.containsKey(1);
		System.out.println(mi.equals(mi));
		mi.isEmpty();
		System.out.println(mi.get(3));
		System.out.println(hasValue);
		System.out.println(hasKey);
		mi.clear();
		//iterating using iterator
	   Iterator<Map.Entry<Integer,String>> i=mi.entrySet().iterator();
	    while(i.hasNext())
        {
             Map.Entry<Integer,String> entry = i.next();
             System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
        }
	    //using for loop
        for (Map.Entry<Integer,String> entry : mi.entrySet())
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
        System.out.println(mi);
        //conversion of one map to another
		Map<Integer,String> mi2=new TreeMap<Integer,String>(mi);
		System.out.println(mi2);
    }
		
}

