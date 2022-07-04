package logical_programs;

public class ReverseMiddleString {

	public static void main(String[] args) 
	{
		String sample="abc pqr xyz";
		String[] ar = sample.split(" ");
		 
		System.out.println(sample);
		
		//String ar[]={"abc","pqr","xyz"}
		// 0 1 2
		
		for(int i=0;i<=ar.length-1;i++)
		{
		  if(i%2==0)
		   {
		     String s = ar[i];
		     ar[i]=revString(s);
		     System.out.print(ar[i]+" ");
		   }
		 else 
		 {
			System.out.print(ar[i]+" ");
		}
		}
		

	}

	private static String revString(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
