import java.util.*;
public class Main {

	public static void main(String[] args) {
		//fill your code here
		Integer n;
		List<String> arr=new ArrayList<String>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of items:");
		n=input.nextInt();
		input.nextLine();
		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
		for(int i=0;i<n;i++) {
			
			String item=input.nextLine();
			arr.add(item);
		}
		System.out.println("Items:");
		for(String item:arr) {
			System.out.println(item.replace("$",","));
		}
	}
}
