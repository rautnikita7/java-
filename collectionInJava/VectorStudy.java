package collectionInJava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector a = new Vector();
        
		a.add(1);
		a.add("mehkar");
		a.add(true);
		a.add(99.9);
		a.add(null);
		a.add("pune");
		
		System.out.println(a);
         
		a.add(5, "aurangabad");
	    System.out.println(a);
	    
	    a.remove(2);
	    System.out.println(a);
	    
	    System.out.println(a.contains("maharashtra"));
	    System.out.println(a.size());
	    
	    System.out.println("----------");
	    //by using for each loop
	    for(Object n:a)
	    {
	    	System.out.println(n);
	    }
	    System.out.println("-----------");
	    //
	    Iterator it = a.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    System.out.println("------------");
	    //
	    Enumeration en = a.elements();
	    while(en.hasMoreElements())
	    {
	    	System.out.println(en.nextElement());
	    }
	}

}