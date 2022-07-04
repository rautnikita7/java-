package logical_Programming;

public class C_multiply_2_num_without_multipliction {

	public static void main(String[] args) 
	{
		int num1= 5;
		int num2= 7;
		
		int sum=0;
		for(int i=1; i<=num2; i++)
		{
			sum = sum+num1;
			
		}
		System.out.println(sum);//ans is 35
	}
	// note --> if you use mention num2 in for then use num1 inside vice versa

}
