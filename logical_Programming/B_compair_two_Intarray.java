package logical_Programming;

import java.util.Arrays;

public class B_compair_two_Intarray {

	public static void main(String[] args) 
	{
		int ar1[]= {10,20,60};
		int ar2[]= {40,50,60};
		int ar3[]= {40,50,60};
		
		//compair array1 and array2
		System.out.println(Arrays.equals(ar1, ar2));
        
		//compair arrays1 and arrays3
		System.out.println(Arrays.equals(ar1, ar3));
		
		//compair arrays2 and arrays3
		System.out.println(Arrays.equals(ar2, ar3));
		
		
     
	}

}
