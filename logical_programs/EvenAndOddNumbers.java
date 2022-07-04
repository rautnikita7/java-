package logical_programs;

import java.util.Scanner;

public class EvenAndOddNumbers {

	public static void main(String[] args) 
	{ 
		
		
		//System.out.println("division"+b/a);
		//System.out.println("raminder"+b%a);
		
		//even number b%a-->will be zero 
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter values of a");
		int a = sc.nextInt();
		int b= 2;
		
		if(a%b==0)
		{
			System.out.println("given number is even ");
		}
		
		else
		{
			System.out.println("given num is odd");
		}
		
		 
	}

}
