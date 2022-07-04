package logical_Programming;

import java.util.Scanner;

public class A_Scanner_Accept_IntputFormUser {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//for numbers--> scan.nextInt()
		System.out.println("enter number1");
		int num1 = scan.nextInt();
		
		System.out.println("enter number2");
		int num2 = scan.nextInt();
		
		System.out.println("Addition "+(num1+num2));
		
		//for storing-->
		System.out.println("enter student name");
		
		String name = scan.next();
		System.out.println(name);

	}

}
