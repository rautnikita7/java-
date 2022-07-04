package constructor;

public class Cs3 {
	// example for user defined constructor with parameters
		int num1;
		int num2;
		int num3;
		
		public Cs3() // user defined without parameters
		{
			num1=10;
			num2=20;
			num3=30;
		}
		
		public Cs3(int a)// user defined with single parameter constructor 
		{
		num1=a;	
		}
		
		public Cs3(int a, int b)// user defined with two parameter constructor
		{
			num1=a;
			num2=b;
			
		}
		
		public Cs3(int a, int b, int c)
		{
			num1=a;
			num2=b;
			num3=c;
			
		}
		
	public static void main(String[] args) 
	{
		Cs3 c1= new Cs3();// object created with default value zero
		c1.addition();
		
		Cs3 c2= new Cs3(100);// object created with some default vaule
		c2.addition();
		
		Cs3 c3= new Cs3(80, 90);
		c3.addition();
		
		Cs3 c4= new Cs3(70, 80, 90);
		c4.addition();

	}

	public void addition()// non static method
	{
		int sum= num1+num2+num3;
		System.out.println("Addition is "+sum);
	}
	
	

}
