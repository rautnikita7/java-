package STAR_logical_programs;

public class EX13_butterfly {

	public static void main(String[] args) 
	{
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         *
		// ( remember star space star space)
		int star=1;  // star on the first row left
		int space=5; // space on first row left 
		int star2=1;  //star on the first row right
		int space2=4; // space on the first row right
		
		for( int i=1; i<=9; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=space; k++)
			{
				System.out.print(" ");
			}
			for(int m=1; m<=space2; m++)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=star2; l++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
	 			star++;
	 			space--;
	 			star2++;
	 			space2--;
			}
			else
			{
				star--;
	 			space++;
	 			star2--;
	 			space2++;
			}
			System.out.println();
		}
			

	}

}
