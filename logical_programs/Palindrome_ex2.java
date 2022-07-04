package logical_programs;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Palindrome_ex2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value ");
		String orignal = sc.next();
		
		String reverse = "";
		
		for(int i=orignal.length()-1; i>=0; i--)
		{
			reverse=reverse+orignal.charAt(i);
		}
		
		System.out.println("enter orignal value "+orignal);
		System.out.println("enter reverse string "+reverse);
		
		if(orignal.equals(reverse))
		{
			System.out.println("stirng is palindrme ");
		}
		
		else
		{
			System.out.println("string is not palindrome ");
		}
		

	}

}
