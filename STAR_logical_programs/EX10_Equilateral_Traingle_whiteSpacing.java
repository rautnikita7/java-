package STAR_logical_programs;

public class EX10_Equilateral_Traingle_whiteSpacing {

	public static void main(String[] args) 
	{    
		//Equilateral_Traingle downward with space
		//* * * * * 
        // * * * *
		//  * * *
		//   * *
		//    *
		
		int space=0;
		int star=5;
		for(int a=1; a<=5; a++)
		{
			for(int b=1; b<=space; b++)
			{
				System.out.print(" ");
				
			}
			for(int c=1; c<=star; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
	}

}
