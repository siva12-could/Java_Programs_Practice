import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the string");
			String name=br.readLine();
			String remove=name.trim().replaceAll("\\s+"," ");
			System.out.print(remove);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
