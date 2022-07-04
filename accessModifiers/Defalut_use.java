package accessModifiers;

public class Defalut_use {

	int x=10;
	public int y=22;
	private int z=11;
	
	public static void main(String[] args)
	{   
		add();
		Defalut_use de=new Defalut_use ();
		de.add1();
		de.add2();
		de.add3();
		
		System.out.println("variable="+de.x);
		System.out.println("variable="+de.y);
		System.out.println("variable="+de.z);
		
	}
	public static void add()
	{
		System.out.println("Addition");
	}
  void add1()
 {
	 System.out.println("Addition1");
 }
 public void add2()
 {
	 System.out.println("Addition2");
 }
 private void add3()
 {
	 System.out.println("Addition3");
 

}
}