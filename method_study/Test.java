package method_study;

public class Test {

	public static void main(String[] args) 
	{
       method1();// calling static method from same class
       
       Test d = new Test();// created object --->d
                      // to call non static method ---->we need object
                      // classname  objectname= new classname();
        d.method2();// calling nonstatic method from same class
        
     // to call non static method from another, we need  object of that class
        
        Myclass m= new Myclass();// created object of another class
        m.myMethod1();// calling Non static method  another class
        m.myMethod1();
       
        method1();
        method1();
	}
   
	public static void method1()  //static method 
	
	{
		int a=10;
		int b=30;
		int sum=a+b;
		System.out.println("addition is "+sum);
		
	}
	
	public void method2()// non static method
	{
		int s=90;
		int k=88;
		int sub=s-k;
         System.out.println("substraction is "+sub);
	}
}
