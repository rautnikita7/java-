package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_Int {

	public static void main(String[] args) 
	{
    //ArrayList<Sting> as= new ArrayList<String>(); its a specific arraylist----> only string data type can be store
	ArrayList<Integer> al = new ArrayList<Integer>();
	  
	  al.add(2);
	  al.add(4);
	  al.add(6);
	  al.add(8);
	  al.add(10);
	  al.add(12);
	  
	  Iterator<Integer> it = al.iterator();
	  
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  for(Integer m:al) 
	  {
		  System.out.println(m);
	  }
	  
	}

}
