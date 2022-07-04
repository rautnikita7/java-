package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_study_ex2 {

	public static void main(String[] args) 
	{
		//ArrayList al = new ArrayList(); its a generic arraylist ---->any type of data can be store
		ArrayList al =new ArrayList();
		
		al.add("nikita");
		al.add(1998);
		al.add("mehkar");
		al.add(443301);
		al.add("AB");
		al.add(23.6);
		al.add(0);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(5));
		
		al.add(2, "aurangabad");//add element at particular index--->right side shift
		System.out.println(al);//he element nhi print zalet he array list print zale ahet
		
		
		al.remove(4);//remove element at particular index---> means left side shift 
		System.out.println(al);//he element nhi print zalet he array list print zale ahet
		
		//size method is a collection method 
		System.out.println(al.size());//size method use--->max index size-1
		
		//moving through list using for loop
		System.out.println("===============");
		for(int i=0; i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		//moving through list using cursor-->Iterator
		System.out.println("---------------");
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-------------");
		//moving through list using cursor-->listIterator
		ListIterator its = al.listIterator();
		
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		
		System.out.println("---------------");
		
		//using for each loop
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		
		
	}

}
