package logical_programs;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) 
	{    // input of revers string
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string vlaue");
		String s = sc.next();
		
		System.out.println("given string is "+s);
		
		String rev="";
		
		for(int  i=s.length()-1;i>=0;i--)
		{
			 rev=rev+s.charAt(i);
		}
		System.out.println("reverse string is "+rev);
	
		

	}

}
