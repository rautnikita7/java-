package methods;

public class MethodsWithParameter {

	public static void main(String[] args) 
	{
		MethodsWithParameter m= new MethodsWithParameter();// created objcet
		m.addition();
		m.addition1(30, 60);
		m.addition1(20, 30);
	}
		public void addition()//method without parameters
		{
		    int a=10;
		    int b=20;
		    int sum=a+b;
		    System.out.println("Addition is "+sum);
		}
		public void addition1(int a,int b)// method withparameters
		{
		     int sum=a+b;
		     System.out.println("Addition is "+sum);
		}
		public void studentInfo(String string, int i, String string2, float f, int j, char c) {
			// TODO Auto-generated method stub
			
		}
	}


