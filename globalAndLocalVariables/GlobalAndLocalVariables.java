package globalAndLocalVariables;

public class GlobalAndLocalVariables {
	
	int a=10;// non -static global variable
	int b=20;// non -static global variable
	static int c=30;//// static global variable
	static int d=40;// static global variable
	
	public static void main(String[] args) 
	{
		GlobalAndLocalVariables gb= new GlobalAndLocalVariables();// created object
				gb.addition();// calling non-static method using object
				
				sub();// calling static method from same class		
	}
	public void addition()// non-static method
	{
	     //We can call static and Non static variables  in non static method 
		
	     int sum1=a+b;//Non static variables
	     int sum2=c+d;//static
	     int m=10;//local variable
	     System.out.println("addition is "+sum1);
	    System.out.println("addition is "+sum2);
	}
	public static void sub()// static method
	{
	//We can call only static variables in static methods 
	// int sub1=a-b;--> we cant call non static variables in static methods 
		
	int sub2=c-d;// calling static variables in static method
	System.out.println("sub is "+sub2);
	}

}
