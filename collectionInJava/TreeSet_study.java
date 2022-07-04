package collectionInJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_study {

	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet<>();
		
		t.add(1);
		t.add(5);
		t.add(60);
		t.add(4);
		//t.add('i');
		// NOTE ; we can store only homogeneous data
		// Homogeneous data means we can use one element when we use 2 element then 'classcastexception' shows 
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		
		System.out.println("------------------------------------");
		
		Iterator it = t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	     
		System.out.println("---------------------------------------");
        for(Object p:t)
        {
        	System.out.println(p);
        }
	}

}
