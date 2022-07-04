package method_study;

public class Sample {

	public static void main(String[] args) 
	{   
		System.out.println("main method is running ");
		demo();// static method call from from same class
		       // to call static method from same class use direct methodname(); 
		
	}
   public static void demo() 
   {
	  System.out.println("hi am dem method form sample class");
	  
   }
}
