import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students in the class");
		Integer no_students=Integer.parseInt(input.readLine());
		System.out.println("Enter the number of teams");
		
		Integer no_teams=Integer.parseInt(input.readLine());
		
		System.out.println("The number of students in each team is "+(no_students/no_teams)+" and the number of  students left out is "+(no_students%no_teams));
		
		
	}
}
