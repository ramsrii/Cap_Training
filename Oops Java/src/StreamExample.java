import java.util.*;
import java.util.stream.Collectors;

class Studet
{
	int regno;
	String name;
	int height;
	int weight;
	
	public Studet(int regno, String name, int height, int weight) {
		super();
		this.regno = regno;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Studet [regno=" + regno + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
public class StreamExample {
public static void main(String[] args) {
	Studet s1=new Studet(123,"rama",5,60);
	Studet s2=new Studet(124,"vetri",6,70);
	Studet s3=new Studet(122,"sriram",7,30);
	Studet s4=new Studet(167,"bharatha",2,80);
	/*List<Studet> Studetlist= new ArrayList<Studet>();
	Studetlist.add(s1);
	Studetlist.add(s2);
	Studetlist.add(s3);
	Studetlist.add(s4);*/
	
	List<Studet> Studetlist=Arrays.asList(s1,s2,s3,s4);
	/*for(Studet s:Studetlist)
	{
		System.out.println(s);
	}*/
	Studetlist.forEach(System.out::println);
	
	/*System.out.println("filterd based on height");
	List<Studet> Studentoutput=Studetlist.stream().filter(s->s.height>=5).collect(Collectors.toList());
	Studentoutput.forEach(System.out::println); */
	/*(s)->
	{
		int h=s.height;
		if(h>=5)
		{
			return h;
		}
	}*/
	//List<Studet> Studentoutput=Studetlist.stream().sorted().collect(Collectors.toList());

	List<Studet> Studentoutput=Studetlist.stream().sorted((st1,st2) -> st1.name.compareTo(st2.name)).collect(Collectors.toList());
	Studentoutput.forEach(System.out::println);
	
	
	//List<Studet> Studentoutput=Studetlist.stream().filter(s->s.weight>=70).sorted((st2,st3) ->Integer.valueOf(st2.regno).compareTo(st3.regno)).collect(Collectors.toList());
	//Studentoutput.forEach(System.out::println);
	
	
	//List<String> Studentoutput=Studetlist.stream().filter(s->s.weight>=70).sorted((st2,st3) ->st2.name.compareTo(st3.name)).map(i->i.name).collect(Collectors.toList());
	//Studentoutput.forEach(System.out::println);
	
}
}
