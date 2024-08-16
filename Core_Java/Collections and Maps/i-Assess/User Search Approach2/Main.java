package com.userdata.HashMap;


import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of users:");
		int n=input.nextInt();
		Map<String,List<User>> map=new HashMap<>();
		input.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("Enter details of user"+(i+1));
			System.out.println("Username:");
			String uname=input.nextLine();
			System.out.println("Bank name:");
			String bname=input.nextLine();
			User u=new User(uname,bname);
			map.putIfAbsent(uname,new ArrayList<>());
			map.get(uname).add(u);
		}
		System.out.println("Enter username(Expire in one month) seperated by comma");
		String[] data=input.nextLine().split(",");
		List<String> expirenames=Arrays.asList(data);
		Collections.sort(expirenames);
		System.out.println("Users going to expire within a month");
		List<User> ad=new ArrayList<>();
		for(String u:expirenames) {
			List<User> users=map.get(u.trim());
			if(users!=null) {
				ad.addAll(users);
			}
		}
		
		int c=1;
		
		for(User a:ad) {
			System.out.println("User "+c);
			System.out.println("User Name = "+a.getUsername());
			System.out.println("Bank Name = "+a.getBankname());
			c+=1;
		}
		
	}
}
