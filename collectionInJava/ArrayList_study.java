package collectionInJava;

import java.util.ArrayList;

public class ArrayList_study {

	public static void main(String[] args)
	{    //ArrayList ar = new ArrayList(); its a generic arraylist ---->any type of data can be store 
		//ArrayList<Sting> as= new ArrayList<String>(); its a specific arraylist----> only string data type can be store
		
		ArrayList ar = new ArrayList();
		ar.add("nikita");
		ar.add(1998);
		ar.add("mehkar");
		ar.add(443301);
		ar.add("AB");
		ar.add(23.6);
		ar.add(0);
		ar.add(null);
		ar.add(null);
		
		System.out.println(ar);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		System.out.println(ar.get(5));
		
		
      
	}

}
