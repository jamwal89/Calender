import java.util.*;
import java.util.GregorianCalendar;

public class DateFormat
{
	private static final String DEFAULT = null;

	public static void main(String args[])
	{
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the  month");
		int month = keyboard.nextInt();
		month = month -1;
		System.out.println("Enter the year");
		int year =keyboard.nextInt();
		
		String Months []={"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		int Days []= {31,29,31,30,31,30,31,31,30,31,30,31};
		GregorianCalendar gc= new GregorianCalendar(year,month,1);
		System.out.println("Year: " + gc.get(Calendar.YEAR));
		System.out.println("Month: " + gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("\t "+ year);
		System.out.println("\t " + Months[month]);
		int d = gc.get(Calendar.DAY_OF_WEEK);
		
		
		
		
		
				
				
		
			}
		
			
		
	}
