package STAR_logical_programs;

public class EX8_Equilateral_Traingle_upward {

	public static void main(String[] args) 
	{ 
		//   *
		//  ***
		// *****
		//*******
		
		int space=3;
		int star=1;
		for(int i=1; i<=4; i++) //outer for loop ; rows=4
		{
			for(int j=1; j<=space; j++)// inner for loop
			{
				System.out.print(" ");
			}
		     for(int j=1; j<=star; j++)
		     {
		    	 System.out.print("*");
		     }
		   
		     System.out.println();
		     space--;  
		     star=star+2;
		     
		     
		}
		
		
		
		
	}

}
