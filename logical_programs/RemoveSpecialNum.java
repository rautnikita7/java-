package logical_programs;

public class RemoveSpecialNum {

	
	public static void main(String[] args)
	{
		String a="Velocity@";
		System.out.println(a.replace("@", ""));
		String b="Velo@city#123";
		System.out.println(b.replaceAll("[^a-zA-Z]", ""));
		
	}

}
