class Animals
{
	String name;
	Animals(String name)
	{
		this.name=name;
	}
	void eat()
	{
		System.out.println(name+" eating");
	}
	
}
class Dog extends Animals
{
	Dog(String name)
	{
		super(name);
	}
	void bark()
	{
		System.out.println(name+" barking");
	}
}
class BabyDog extends Dog
{
	BabyDog(String s)
	{
		super(s);
	}
	void weep()
	{
		System.out.println(name+" weeping");
	}
}
public class Animal {
public static void main(String args[])
{
	BabyDog d=new BabyDog("dog1");
	d.weep();
	d.bark();
	d.eat();
	Dog d1=new Dog("dog2");
	d1.bark();
	//d1.weep();
	
	
}
}
