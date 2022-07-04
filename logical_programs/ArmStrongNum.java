package logical_programs;

public class ArmStrongNum {

	public static void main(String[] args)
	{
		int a = 33;
		int num =0;
		
		for(int i=a; i>0; i=i/10)
		{
			int num1=i%10;
			num=num+(num1*num1*num1);
					
		}
		
		System.out.println("orignal num is "+a);
		
		System.out.println("addition of digit is armstorng num ");
		
		if(a==num)
		{
			System.out.println("given num is armstrong num");
			
		}
		else
		{
			System.out.println("given num is not armstrong num");
		}
		
		
	}

}
