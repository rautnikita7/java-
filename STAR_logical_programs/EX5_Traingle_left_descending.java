package STAR_logical_programs;

public class EX5_Traingle_left_descending {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		//step1: count rows=5 count columns =5
		int star= 5;  // no of star present in first row 
		for(int i=1; i<=5; i++) // outer loop for rows
		{
			for(int j=1; j<=star; j++)//inner loop for columns
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	
	}

}
