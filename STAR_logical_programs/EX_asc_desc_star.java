package STAR_logical_programs;

public class EX_asc_desc_star {

	public static void main(String[] args) 
	{
		//*
		//**
		//***
		//****
		//*****
		//******
		//*****
		//****
		//***
		//**
		//*
		int star=1;
		for(int i=1; i<=11; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<6)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}

}
