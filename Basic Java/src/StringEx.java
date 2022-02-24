import java.util.*;
public class StringEx {
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		StringTokenizer tokens = new StringTokenizer(n);
		System.out.println("number of words are: "+tokens.countTokens());
		int space=0;
		int splchar=0;
	for(int i=0; i<n.length(); i++){
			char ch=n.charAt(i);
			 if(ch==' '){
			        space++;
			    }
			 
			}
		System.out.println("Number of whitespaces: "+space);
		
		int count=0;
		int vowel=0;
		for(int i = 0; i < n.length(); i++) {    
            if(n.charAt(i) != ' ')    
                count++;    
		
		
		if(n.charAt(i)=='A'||n.charAt(i)=='E'||n.charAt(i)=='I'||n.charAt(i)=='O'||n.charAt(i)=='U'||n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u') 
			vowel++;
		else
		 {
			 splchar++;
		 }
		
		}
		System.out.println("Number of vowels: "+vowel);
		System.out.println("Number of characters: "+count); 
	}

}
