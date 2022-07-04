package logical_programs;

import java.util.Arrays;

public class Array_equals_study {

	public static void main(String[] args) 
	{
		int ar[]= {10,30,40};
		int ar1[]= {20,10,30};
		int ar2[]= {20,10,30};
		
		//Compare ar1 and ar2
		System.out.println(Arrays.equals(ar1, ar2));
		
		//Compare ar and ar2
		System.out.println(Arrays.equals(ar, ar1));
		
		
	}

}
