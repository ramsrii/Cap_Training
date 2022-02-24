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
public interface InterfaceEx {
	public static CommissionInfo generateCommissionObtained (Ticket ticketObj)
	{
		
		CommissionInfo c=(ticketObj)->{double d=0;String s=ticketObj.getClassType();
		if(s=="SL" || s=="2S" )
			d+=60;
		else 
			d+=100;
		return d;};
		c.calculateCommissionAmount(ticketObj);
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of passengers ");
	int count=s.nextInt();
	Ticket t1[]=new Ticket[count];
	for(int i=0;i<=count;i++)
	{
		System.out.println("Details of passenger no "+(i+1));
		t1[i].getPnrNo();
		t1[i].getPassengerName();
		t1[i].getSeatNo();
		t1[i].getClassType();
		t1[i].getTicketFare();
		
		generateCommissionObtained(t1[i]);}
	
	
}
}
