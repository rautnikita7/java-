package logical_programs;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		//num = 123-->321
		
		int num=123;
		
		//to convert int to string
		String orignal = Integer.toString(num);
		String rev ="";
		
		for (int i=orignal.length()-1; i>=0; i--)
		{
            rev=rev+orignal.charAt(i);
		}
		System.out.println(rev); // here rev is in string format 
		
		int revNum = Integer.parseInt(rev);
		
		System.out.println("orignal number in "+num);
		System.out.println("reverse number is "+revNum);
		
	}

}
