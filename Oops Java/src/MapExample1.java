import java.util.*;
class student 
{
	Map<String,String> stud=new HashMap<String,String>();
	void input()
	{
		stud.put("1","narayanan");
		stud.put("2","d");
		stud.put("3","I");
	}
	Map<String,String> getDetails(){
		return stud;
	}
}
public class MapExample1 {
	public static void main(String args[])
	{
		student s=new student();
		s.input();
		Map<String,String> mi=s.getDetails();
		System.out.println(mi);
		
		Iterator<Map.Entry<String,String>> i=mi.entrySet().iterator();
	    while(i.hasNext())
        {
             Map.Entry<String,String> entry = i.next();
             System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
        }
		
		
	}

}
