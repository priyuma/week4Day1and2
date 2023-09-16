package week4.Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,5,6,7,8,10};
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
		
			if (i+1!=data[i]) {
				
				set.add(i+1);
				break;
			}
		}
		List<Integer> list2 = new ArrayList<Integer>(set);
		System.out.println(list2);		
		
		}
}
	
	
	/* Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */

