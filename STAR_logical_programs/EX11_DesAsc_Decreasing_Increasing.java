package STAR_logical_programs;

public class EX11_DesAsc_Decreasing_Increasing {

	public static void main(String[] args) 
	{
		//------------------------------------
		//*****
		//****
		//***
		//**
		//*
		//*
		//**
		//***
		//****
		//*****
		//--------------------------------------
		
		//step1 count total no of rows = 9 ; use outer for loop for no of rows
		
		int star=5;
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			//star--;
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
	}

}
