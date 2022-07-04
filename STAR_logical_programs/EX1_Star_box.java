package STAR_logical_programs;

public class EX1_Star_box 
{

	//*****    // row =3
	//*****    // columns =5
	//*****    // always start with rows (outer loop)
	
	public static void main(String[] args)
	{
		//outer for loop for row (count  rows ) here rows = 3
		for( int i=1; i<=3; i++)
		{
			// inner for loop for columns( count coumns) here col =5
			for( int j=1; j<+5; j++)
			{
				System.out.print("*"); // use print only 
				
			}
			System.out.println(); //on next line use ln 
		}
	}

}
