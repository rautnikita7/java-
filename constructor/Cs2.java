package constructor;

public class Cs2 {
	// example of user defined constructor
	
		String city="Pune"; // variable declaration manualy
		
		
		// use of constructor --> to initiazite variable
		
		String name;// variable declration
		
		public Cs2()// user defined constructor--> without parameters
		{
			name="Velocity";// used to initialize variable "name"
		}
		
		
		
	public static void main(String[] args) 
	{
		
display1();
		
		Cs2 c2= new Cs2();
		c2.display();

	}
	
	public void display()
	{
		System.out.println("I am non static display method");
		System.out.println("My city name is "+city);
		System.out.println("My name is "+name);
	}
	
	public static void display1()
	{
		System.out.println("I am  static display1 method");
	}

	

}
