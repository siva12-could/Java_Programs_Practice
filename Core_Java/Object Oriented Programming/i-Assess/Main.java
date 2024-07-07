import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.io.*;
public class Main {
	public static void main(String args[]) throws Exception{
		Integer n;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice:\n1.Exhibition event\n2.Stage event");
		n=Integer.parseInt(input.readLine());
		if(n==1) {
			System.out.println("Enter the details of exhibition:");
			String[] arr=input.readLine().split(",");
			System.out.println("Enter the starting date of the event:");
			String startdate=input.readLine();
			System.out.println("Enter the ending date of the event:");
			String enddate=input.readLine();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
			try {
				Date d1=sdf.parse(startdate);
				Date d2=sdf.parse(enddate);
				Exhibition obj1=new Exhibition(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4]),Integer.parseInt(arr[5]));
				long differencemilli=d2.getTime()-d1.getTime();
				long difffrencedays=TimeUnit.DAYS.convert(differencemilli,TimeUnit.MILLISECONDS);
				System.out.println("The GST to be paid is Rs."+difffrencedays*(0.05*(obj1.getCostPerDay())));
				
				
			}catch(Exception e) {
				
			}
		}
		else if(n==2) {
			System.out.println("Enter the details of stage event:");
			String[] arr2=input.readLine().split(",");
			System.out.println("Enter the starting date of the event:");
			String startdate=input.readLine();
			System.out.println("Enter the ending date of the event:");
			String enddate=input.readLine();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
			try {
				Date d1=sdf.parse(startdate);
				Date d2=sdf.parse(enddate);
				StageEvent obj2=new StageEvent(arr2[0],arr2[1],arr2[2],arr2[3],Double.parseDouble(arr2[4]),Integer.parseInt(arr2[5]));
				long diffrencemilli=d2.getTime()-d1.getTime();
				long differenceday=TimeUnit.DAYS.convert(diffrencemilli,TimeUnit.MILLISECONDS);
				System.out.println("The GST to be paid is Rs."+differenceday*(0.15*(obj2.getCostPerDay())));
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	
	}
}
