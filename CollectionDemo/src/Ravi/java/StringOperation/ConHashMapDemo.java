
package Ravi.java.StringOperation;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMapDemo {

	public static void main(String[] args) {
		 
		ConcurrentHashMap map = new ConcurrentHashMap<>();
		
		map.put(100, "Ravi");
		map.put(101, "check");
		map.put(102, "Ashu");
		map.put(103, "Patu");
		map.put(103, 107);
		
		map.putIfAbsent(106, "test");
		map.replace(102, "Ashu", "Nirma");
		
		System.out.println(map);
		
		
		
		
		
	}
}
