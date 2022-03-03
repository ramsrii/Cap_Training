import java.util.*;
class Player{
	List<Integer> scoreList = new ArrayList<Integer>();
	public void	addScoreDetails(int runScored) {
		scoreList.add(runScored);
	}
	 public double getAverageRunScored() {
		 double sum = (double)scoreList.stream().mapToInt(Integer::intValue).sum();
		 return sum/scoreList.size();
	 }
}
public class BattingEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player p =new Player();
		while(true) {
			System.out.println("1. add Runs Scored\n"+ "2. calculate average runs scored\n"+ "3. exit\n"+ "enter your choice");
			int choice = sc.nextInt();
			if(choice==1) {System.out.println("enter the runs scored:"); p.addScoreDetails(sc.nextInt());}
			if(choice==2) {System.out.println("average runs secured:"+p.getAverageRunScored());}
			if(choice==3) {System.out.println("thank you for using the Application");sc.close(); break;}
		}
	}
}