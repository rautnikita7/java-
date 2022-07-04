package logical_programs;

import java.util.Scanner;

public class Even_Odd_num_ex2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("plz enter values ");
		int y = sc.nextInt();
		int z = 2;
		
		if(y%z==0)
		{
			System.out.println("value is even ");
		}
		else
		{
			System.out.println("value is odd");
		}
		
		
		
	}

}
