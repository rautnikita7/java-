package logical_Programming;

public class D_reverse_string {

	public static void main(String[] args) 
	{
		String org = "NIKITA";
		String rev = "";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(" original string ="+org);
		System.out.println("reverse string ="+rev);

	}

}
