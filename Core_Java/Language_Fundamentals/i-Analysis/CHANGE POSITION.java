import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the x-coordinate of the left bottom vertex");
		Integer x_coordinate=Integer.parseInt(input.readLine());
		System.out.println("Enter the y-coordinate of the left bottom vertex");
		Integer y_coordinate=Integer.parseInt(input.readLine());
		System.out.println("Enter the length of a side");
		Integer len=Integer.parseInt(input.readLine());
		System.out.printf("The center of the room is at (%d,%d)",x_coordinate+len/2,y_coordinate+len/2);
		
	}
}
