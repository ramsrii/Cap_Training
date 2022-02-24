import java.util.Scanner;

public class Assign14 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String str=s.nextLine();
	System.out.println("Enter the string to be replaced");
	String rep=s.next();
	System.out.println("Enter the replacment string");
	String repl=s.next();
	if(str.contains(rep))
	{
	str=str.replaceAll(rep, repl);}
	
	System.out.println(str);
}
}
