package polymorphrish_study;

public class Methodoverloading {

	public static void main(String[] args) 
	{
		Methodoverloading mo= new Methodoverloading();// created object of a class
		mo.add();
	    mo.add(10, 30);
		mo.add(12.22f,12.13f);

	}
	public void add() // method with zero parameter
	{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("Sum is "+sum);
	}
	public void add(int a, int b)//method with two parameters
	{
	int sum=a+b;
	System.out.println("Sum is "+sum);
	}
	public void add(float a, float b) {
	double sum= a+b;
	System.out.println("Sum is "+sum);
	} 
	

}
