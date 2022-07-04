package logical_programs;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value ");
	     String orignal = sc.next();
	     
	     String reverse = "";
	     
	     for(int i=orignal.length()-1; i>=0; i--)
	     {
	    	reverse= reverse+orignal.charAt(i);
	     }
	     
	     System.out.println("given string is "+orignal);
	     System.out.println("reverse string is "+reverse);
	     
	     if(orignal.equals(reverse))
	     {
	    	 System.out.println("string is palindrome");
	     }
	     else
	     {
	    	 System.out.println("string is not palindrome");
	     }
	     
	     
	     

	}

}
