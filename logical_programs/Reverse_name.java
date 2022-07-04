package logical_programs;

import java.util.Scanner;

public class Reverse_name {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter string vlaue");
		String A = sc.next();
		
		System.out.println("enter name "+A);
		
		String reverse = "";
		
		for(int i=A.length()-1; i>=0; i--)
		{
			reverse=reverse+A.charAt(i);
		}
		System.out.println("plz enter your name "+reverse);
		
	}

}
