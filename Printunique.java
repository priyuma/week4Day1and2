package week4.Day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Printunique {
	
	public static void main(String[] args) {
		
		String name ="PRRIYA";
		
		char[] myname = name.toCharArray();
		
		Set<Character> setname= new HashSet<Character>();
		for (int i = 0; i < myname.length; i++) {
			setname.add(myname[i]);
			
		}
		System.out.println(setname);
		
		
	}

}

