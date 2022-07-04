package collectionInJava;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_study {

	public static void main(String[] args)
	{
		
      LinkedList  AN = new LinkedList();
      
      AN.add("maharashtra");
      AN.add(null);
      AN.add(99.9);
      AN.add('a');
      AN.add("maharashtra");
      AN.add(992147);
      
      System.out.println(AN);
      System.out.println(AN.size());
      System.out.println(AN.remove(1));
      System.out.println(AN.contains("mehkar"));
      System.out.println(AN.get(3));
      System.out.println("-----------------------------");
      
      Iterator IT = AN.iterator();
      while(IT.hasNext())
      {
    	  System.out.println(IT.next());
      }
      System.out.println("-----------------------------");
      
      
      for(Object F:AN)
      {
    	System.out.println(F);  
      }
      
	}
	

}
