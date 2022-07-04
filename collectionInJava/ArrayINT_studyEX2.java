package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayINT_studyEX2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
        
		al.add(4);
		al.add(4);
		al.add(4);
		al.add(4);
		al.add(4);
		
		Iterator<Integer> IT = al.iterator();
		
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		for(Integer l:al)
		{
			System.out.println(l);
		}
	}

}
