package method_study;

public class Sample2 {

	public static void main(String[] args) 
	{
      System.out.println("mainmethod from sampl2 ");
      demo2();// static method class from same class
               // to class static method from another class use classnane.methodnme();
      Sample.demo();// calling static method from another class means demo2()from sample class
	}
     public static void demo2()
     {
    	 System.out.println("hi am demo 2 from sample2");
     }
}
