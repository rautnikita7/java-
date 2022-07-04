package method_study;

public class Myclass {

	public static void main(String[] args)
	{
		myMethod();
		Myclass m = new Myclass();
		m.myMethod1();

	}
	public static void myMethod()// static method
	{
	String name="Velocity";
	System.out.println("My name is "+name);
	}
	public void myMethod1()// non-static method
	{
	String name="Software Testing";
	System.out.println("My class name is "+name);
	} 
}
	
	
	


