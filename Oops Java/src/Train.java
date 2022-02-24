
public class Train {
	int tno;
	String tname;
	String source;
	String Destination;
	
	void modify()
	{
		
	}
	void setTrain(int n,String t,String s, String d)
	{
		tno=n;
		tname=t;
		source=s;
		Destination=d;
	}
	void getTrain()
	{
		System.out.println("tname="+tname+"\nsource="+source+"\nDestination="+Destination);
	}
	public static void main(String args[])
	{
		Train m=new Train();
		m.setTrain(1001,"Mumbai express","Mumbai","Chennai");
		m.getTrain();
	}

}
