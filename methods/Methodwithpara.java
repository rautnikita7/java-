package methods;

public class Methodwithpara {

	public static void main(String[] args)
	{
		Methodwithpara mp= new Methodwithpara();// created object
		mp.studentInfo("Velocity", 11, "12345678", 22.22f, 
		10, 'M');
		mp.studentInfo("Katraj", 10, "8888888", 99f, 7, 
		'F');
		}
		//name, rollno, mob, age, Batch, gender
		public void studentInfo(String name, int rollnum, String 
		mob,float age, int batch, char gender)//method with parameters
		{
		  System.out.println("====================================");
		  System.out.println("My name is "+name);
		  System.out.println("My RollNum is "+rollnum);
		  System.out.println("My mobile Num is "+mob);
		  System.out.println("My age is "+age);
		  System.out.println("My batch is "+batch);
		  System.out.println("My gender is "+gender);
		  System.out.println("====================================");
		} 
	}  


