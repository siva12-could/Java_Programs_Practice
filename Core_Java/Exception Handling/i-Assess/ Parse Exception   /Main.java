import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main{
	public static void main(String[] argd) {
		Scanner input=new Scanner(System.in);
		String startdate=null;
		String enddate=null;
		Date d1 = null,d2=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
		System.out.println("Enter the stage event start date and end date");
		
		
		sdf.setLenient(false);
		boolean validate=false;
		while(!validate) {
			try {
				startdate=input.nextLine();
				d1=sdf.parse(startdate);
			
				enddate=input.nextLine();
				
				d2=sdf.parse(enddate);
				validate=true;
			}
			catch(Exception e) {
				System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
			}
		}
		System.out.println("Start date:"+sdf.format(d1));
		System.out.println("End date:"+sdf.format(d2));
		
	}
}
