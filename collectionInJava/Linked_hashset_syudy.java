package collectionInJava;

import java.util.LinkedHashSet;

public class Linked_hashset_syudy {

	public static void main(String[] args) 
	{
		LinkedHashSet lh= new LinkedHashSet();
		
		lh.add("aurangabad");
		lh.add("sb");
		lh.add('A');
		lh.add(78.9);
		lh.add(2020);
		lh.add("pune");
		lh.add(null);
		
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.remove(6));
		System.out.println(lh.contains("nashik"));
		
		//
	}

}
