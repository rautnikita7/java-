package logical_programs;

import java.util.Scanner;

public class Reverse_name_ex2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter value");
		String DID = sc.next();
		
		System.out.println("enter value "+DID);
		
		String reveres = "";
		
		for(int i=DID.length()-1; i>=0; i--)
		{
			reveres=reveres+DID.charAt(i);
		}
		
		System.out.println("enter your name "+reveres);
	}

}
