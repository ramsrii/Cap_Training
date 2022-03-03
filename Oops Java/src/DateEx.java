import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class DateEx {
   public static void main(String args[]) throws ParseException {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList<String> emp=new ArrayList<String>();
      for(int i=0;i<n;i++)
      {
    	  String empid=sc.next();
    	  String doj= sc.next();
    	  //Converting String to Date
          SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
          Date date = formatter.parse(doj);
          //Converting obtained Date object to LocalDate object
          Instant instant = date.toInstant();
          ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
          LocalDate givenDate = zone.toLocalDate();
          LocalDate aDate = LocalDate.of(2019, 01, 01);
          //Calculating the difference between given date to current date.
          Period period = Period.between(givenDate, aDate);
          int x=period.getYears();
          if(x>=5)
          {
        	  emp.add(empid);
          }
      }
      Collections.sort(emp);
      
      if(emp.size()>0)
      {
    	  emp.forEach(System.out::println);
      }
      else {
    	  System.out.print("No one is eligible");
      }
   }
}