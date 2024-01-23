package com.mkpits.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class DiffrenceIteratorAndForEach {

	public static void main(String[] args) 
	{
		
		LinkedList<Integer>oddNumbers=new LinkedList<Integer>();
		oddNumbers.add(45);
		oddNumbers.add(55);
		oddNumbers.add(10);
		oddNumbers.add(78);
		oddNumbers.add(60);
		oddNumbers.add(49);
		
		// read the object by foreach loop
		// foreach loop used to get the data but you can not modifide that list 
		for (Integer number : oddNumbers) 
		{
			
			System.out.println(number);
		}

		// Iterator 
		// while using iterator you can modified your list 
		System.out.println("Using Iterator");
		ListIterator<Integer> iterator=oddNumbers.listIterator();
		while(iterator.hasNext())
		{
			int currentValue=iterator.next();
			if(currentValue%2==0)
			{
				iterator.remove();
				continue;
			}
			System.out.println(currentValue);
		
		}
	}

}
