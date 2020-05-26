package Ravi.java.StringOperation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindMaxValueInMap {

	public static void main(String[] args)
    {
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);
        int maxvalue = (Collections.max(map.values()));
         for(Entry<Integer,Integer> entry: map.entrySet())
         {
        	 if(entry.getValue()== maxvalue)
        	 {
        		 System.out.println("Max values are "+entry.getKey());
        	 }
         }

    }

}
