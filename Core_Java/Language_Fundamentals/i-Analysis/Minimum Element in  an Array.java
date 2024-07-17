import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.nextLine();
		int[] arr=new int[n];
		int min=input.nextInt();
		for(int i=1;i<n;i++) {
			arr[i]=input.nextInt();
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min+" is the minium element in the array");
	}
}
