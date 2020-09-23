package com.hsbc.collection;

import java.util.*;

public class MainDemo {
	
	
	// Sort Item By ID;
	
	class sortItemById implements Comparator<Item>
	{

		@Override
		public int compare(Item o1, Item o2)
		{
		return o2.getItem_id()-o1.getItem_id();
		}
		
	}
	
	// Sort Item By Name;
	class sortItemByName implements Comparator<Item>
	{

			@Override
			public int compare(Item o1, Item o2)
			{
				return o1.getName().compareTo(o2.getName());
	        }
	}
	
	// Sort Item By Price
	class sortItemByPrice implements Comparator<Item>
	{

		@Override
		public int compare(Item o1, Item o2)
		{
		   return (int) ((int) o1.getPrice()-o2.getPrice());
	    }
	}
					
	// Sort Item By Rating
	class sortItemByRating implements Comparator<Item>
	{

			@Override
			public int compare(Item o1, Item o2)
			{
				return (int) ((int) o1.getRating()-o2.getRating());
			}
	}
	
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
		
		
		
		
		MainDemo demo=new MainDemo();
		
		
		Collections.sort(product11, demo.new sortItemByRating());
		
		//Collections.sort(product11, demo.new sortItemById());
		//Collections.sort(product11, demo.new sortItemByPrice());
		//Collections.sort(product11, demo.new sortItemByName());
		
		Iterator<Item> iterator =product11.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
    
	
		
		
		
		
	}
}
