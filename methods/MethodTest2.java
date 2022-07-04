package methods;

public class MethodTest2 {

	public static void main(String[] args)
	{
		MethodTest2 uk = new MethodTest2();
        uk.result();
        studendInfo();
        studendInfo();
        studendInfo();
	}
   public void result()
   {
	   int sub1=98;
	   int sub2=76;
	   int sub3=88;
	   
	   int total =sub1+sub2+sub3;
	   int avg=total/3;
	   System.out.println(" my result is "+avg);
	   
   }
   public static void studendInfo()// method without parameter
   {
	   //name, rollno, mob age ,batch, gender
	   
	   String name =" nikita";
	   int rollno=77;
	   String mobnumber="9987585473";
	   int batch =9;
	   char gender='f';
	   
	   System.out.println("-------------------");
	   
	   System.out.println("my name is "+name);
	   System.out.println("my rollno is "+rollno);
	   System.out.println("my mobno is "+mobnumber);
	   System.out.println("my batch is "+batch);
	   System.out.println("my gender is "+gender);
   }
}
