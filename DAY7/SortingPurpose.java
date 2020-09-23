package myapp;

import java.util.Comparator;

public class SortingPurpose {
	
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

}
