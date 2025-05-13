package Inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) 
	{
		Collection<Integer> x1=new ArrayList<Integer>();
		x1.add(10);
		x1.add(20);
		x1.add(30);
		x1.add(40);
		
		System.out.println(x1);
		
		Iterator<Integer> i1= x1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
