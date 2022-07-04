package array_study;

public class Array_study {

	public static void main(String[] args) 
	{
      String name[]= {  "Nikita","Sahil","rashmi","priya","reshma"};
      
      for(int i=0;i<=name.length-1;i++)
      {
    	  System.out.print(name[i]+" ");
      }
      System.out.println();
      
      int no[]= {0,1,2,3};
      for(int i=0;i<=no.length-1;i++)
      {
    	  System.out.println(no[i]);
      }
	
       char grade[]= {'a','b','c','d','e'};
       for(int i=0;i>=grade.length;i++)
       {
    	   System.out.println(grade[i]+" ");
    	   
       }
       
       System.out.println();
       String name1[][]= {{"reshma","priya",},{"nikhil","sahikl"}};
       
       for(int i=0;i<=name1.length-1;i++)
       {
    	   for(int j=0;j<=name1.length-j;j++)
    	   {
    		   System.out.println(name1[i][j]);
    	   }
    	   System.out.println();
    		  
    	   }
       

}
}