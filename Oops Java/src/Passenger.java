
public class Passenger {
	int age;
	String name;
	String Adress;
	int Contnumber;
	Train t;
	public Passenger(int age, String name, String adress, int contnumber, Train t) {
		super();
		this.age = age;
		this.name = name;
		Adress = adress;
		Contnumber = contnumber;
		this.t = t;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getContnumber() {
		return Contnumber;
	}
	public void setContnumber(int contnumber) {
		Contnumber = contnumber;
	}
	public Train getT() {
		return t;
	}
	public void setT(Train t) {
		this.t = t;
	}
	
	
	

}
