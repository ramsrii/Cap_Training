import java.util.*;
interface CommissionInfo
{
	public double calculateCommissionAmount(Ticket ticketObj);
}
class Ticket
{
	long pnrNo;
	String passengerName;
	int seatNo;
	String classType;
	double ticketFare;
	Ticket(){}
	public Ticket(long pnrNo, String passengerName, int seatNo, String classType, double ticketFare) {
		super();
		this.pnrNo = pnrNo;
		this.passengerName = passengerName;
		this.seatNo = seatNo;
		this.classType = classType;
		this.ticketFare = ticketFare;
	}
	public long getPnrNo() {
		return pnrNo;
	}
	
	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public double getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFare;
	}
	
}
public class InterfaceEx {
	static double d=0;
	public static CommissionInfo generateCommissionObtained (Ticket ticketObj)
	{
		
		CommissionInfo c=(t1)->{String s=ticketObj.getClassType();
		if(s=="SL" || s=="2S" )
			return 60;
		else 
			return 100;
		};
		d+=c.calculateCommissionAmount(ticketObj);
		return c;
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of passengers ");
	int count=s.nextInt();
	Ticket t1[]=new Ticket[count];
	for(int i=0;i<count;i++)
	{
		t1[i]=new Ticket();
		System.out.println("Details of passenger no "+(i+1));
		//t1[i].setPnrNo(s.nextLong());
		t1[i].setPassengerName(s.next());
		t1[i].setSeatNo(s.nextInt());
		t1[i].setClassType(s.next());
		t1[i].setTicketFare(s.nextDouble());
		generateCommissionObtained(t1[i]);}
	
	System.out.printf("commission%.2f ",d);
}
}
