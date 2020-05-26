package Ravi.java.StringOperation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountOfOccurance {
	
	public static void find(String inputstring)
	{
	
		
	HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
	
		char[] cha = inputstring.toCharArray();
		
		for(char c: cha)
		{
			if(hm.containsKey(c))
			{
				
				hm.put(c,hm.get(c)+1);
				
			}
			else
			{
				hm.put(c,1);
			}
		}
		
		System.out.println(inputstring+": occured in string no of time "+hm);
		
		 int maxValueInMap=(Collections.max(hm.values()));  // This will return max value in the Hashmap
	        for (Entry<Character, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println("Max no chara occurs: "+entry.getKey());     // Print the key with max value
	            }
	        }
	
	}
	
	
	
	public static void main(String[] args) {
		
		find("Ravibhushanjha");
		
	}

}
