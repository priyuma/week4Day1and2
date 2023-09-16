package week4.Day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		
		String[] companynames= {"HCL", "Wipro", "Aspire","CTS"};
		
		
		//char[] charArray = companynames.toCharArray();
		//System.out.println(charArray);
		
		int arraylength = companynames.length;
		System.out.println("length of String : "+arraylength);
		
		
		Arrays.sort(companynames);		
		
		for (int i =companynames.length-1; i >=0 ; i--) {
			
			System.out.println(companynames[i]);
		}
	}

}

//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems