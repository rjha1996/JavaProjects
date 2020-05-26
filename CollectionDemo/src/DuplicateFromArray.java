import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateFromArray {

	public static void main(String[] args) {
		
		String name[] = {"ravi","ravi","rakesh","Ratan"};
		
		
		for(int i=0; i<name.length;i++) {
			for(int j=i+1; j<name.length; j++)
			{
				if(name[i].equalsIgnoreCase(name[j]))
				{
					System.out.println("Duplicate String is:"+ name[i]);
				}
			}
			
		}
		
		
		System.out.println("******************");
		
		Set<String> store = new HashSet<String>();
		
		for(String st : name)
		{
			if(store.add(st)== false)
			{
				System.out.println("Duplicate String is:"+st);
			}
		}
			
			
		System.out.println("******************");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String names :name )
		{
			Integer count = map.get(name);
			
			if(count == null)
			{
				map.put(names, 1);
				
			}
			else
				map.put(names, ++count);
				
		}
		
		Set<Entry<String, Integer>> entry = map.entrySet();
		
		for(Entry<String, Integer> ent : entry)
		{
			if(ent.getValue()>1)
			{
				System.out.println("Duplicate String is:"+ ent.getKey());
			}
		}
		
		
	}

}
