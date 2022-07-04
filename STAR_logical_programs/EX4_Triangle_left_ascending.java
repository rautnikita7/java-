package STAR_logical_programs;

public class EX4_Triangle_left_ascending {
      
	
	public static void main(String[] args) 
	
	{
		
		//*
		//**
		//***
		//****
		//*****
		//******
		//step 1; count row =05 count columns =05
		
		int star= 1; // write no of star in firts row
		for(int i=1; i<=5; i++ )// outer for loop use for rows
		{
			for(int j=1; j<=star; j++)  //inner for loop for columns
			{
				System.out.print("*");   
			}
			
			System.out.println();   // when we wnat to go net line then we use this printng statement for net line
			star++;   // increment in star
		}
	}

}
