
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		//Your code here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the user details");
		String[] ar=br.readLine().split(",");
		User u=new User(ar[0],ar[1],ar[2],ar[3]);
		UserBO ub=new UserBO();
		
		try {
			ub.validate(u);
			System.out.println(u);
		}catch(WeakPasswordException e) {
			System.out.println(e);
		}
	
	
	}

}
