import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of users:");
		int n=Integer.parseInt(br.readLine());
		Map<String,String> map=new HashMap<>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter details of user "+i);
			System.out.println("Username:");
			String u_name=br.readLine();
			System.out.println("Bank name:");
			String b_name=br.readLine();
			if(!map.containsKey(u_name)) {
				map.put(u_name, b_name);
			}
			
		}
		System.out.println("Enter username(Expire in one month) seperated by comma");
		String[] arr=br.readLine().split(",");
		List<String> list1=Arrays.asList(arr);
		Collections.sort(list1);
		int c=0;
		System.out.println("Users going to expire within a month");
		for(int i=0;i<list1.size();i++) {
			boolean l=map.containsKey(list1.get(i));
			if(l==true) {
				String k=map.get(list1.get(i));
				System.out.println("User "+(c+1));
				System.out.println("User Name = "+k.valueOf(list1.get(i)));
				System.out.println("Bank Name = "+k);
				c+=1;
		}
		}
		
	
	
	}
}
