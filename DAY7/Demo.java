package myapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo {
	
	
	public static void main(String args[])
	{
		ArrayList<Item>product11 =new ArrayList<Item>();
		Item item1=new Item(102,"apple",123.00,3.5);
		Item item6=new Item(102,"biscuit",123.00,4.5);
		Item item5=new Item(108,"dairymilk",120.00,2.5);
		Item item2=new Item(104,"banana",25.00,1.5);
		Item item3=new Item(105,"apple",200.00,7.5);
		Item item4=new Item(106,"bkpo",80.00,5.0);
		
		
		
		
		product11.add(item1);
		product11.add(item2);
		product11.add(item3);
		product11.add(item4);
		product11.add(item5);
		product11.add(item6);
		
		SortingPurpose mysort=new SortingPurpose();
		Collections.sort(product11, mysort.new sortItemByRating());
		
		//Collections.sort(product11, mysort.new sortItemById());
		//Collections.sort(product11, mysort.new sortItemByPrice());
		//Collections.sort(product11, mysort.new sortItemByName());
		
		Iterator<Item> iterator =product11.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
    
	
		
		
		
		
	}

}
