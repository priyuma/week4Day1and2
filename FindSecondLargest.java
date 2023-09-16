package week4.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {


	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> set = new TreeSet<>();
				
			for (int i = 0; i < data.length; i++) {
			
						set.add(data[i]);	
			
											
		}
		
			System.out.println(set);
List<Integer> list2 = new ArrayList<Integer>(set);
int listsize = list2.size();
			
			System.out.println("Second largest: "+list2.get(listsize-2)); 
			
			
			
		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */

//      output= 7;

	}
		}