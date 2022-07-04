package collectionInJava;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_study {

	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue<>();
		
		pq.add("nikita");
		pq.add("rajendra");
		pq.add("raut");
		pq.add("mehkar");
		
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.contains("raut"));
        
        
          Iterator it = pq.iterator();
          while(it.hasNext())
          {
        	  System.out.println(it.next());
        	  
          }
          
          for(Object k:pq)
          {
        	  System.out.println(k);
          }
          
	}

}
