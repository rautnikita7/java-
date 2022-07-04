package logical_programs;

import java.util.Scanner;

public class User_input_ex2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of x");
		int x = sc.nextInt();
		System.out.println("enter value of y");
		int y = sc.nextInt();
		
		int sub=x-y;
		System.out.println("sub is "+sub);
		
		
	}

}
