import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapDemo {
	
	
	
	
		
		
	
	
	public static void main(String[] args) 
	{
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Aajesh");
		hmap.put(2, "Ram");
		hmap.put(3, "Aavi");
		hmap.put(4, "Ramanujan");
		hmap.put(5, "Rakesh");
		
		
		Map<Integer, String> result = hmap.entrySet()
		         .stream()
		         .filter(p -> p.getKey().intValue() <= 2) //filter by key
		         .filter(map -> map.getValue().startsWith("A")) //filter by value
		         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		     System.out.println("Result: " + result);	
		     
	}
	
}


