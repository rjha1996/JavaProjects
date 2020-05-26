import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Home lone");
		list.add("Car lone");
		list.add("Bike lone");
		list.add("Phone lone");
		list.add("Property lone");
		list.add("personal lone");
		
		/*for(String lone: list) {
			
			if(lone.equals("Bike lone")) {
				list.remove(lone);
				
			}
			
		}
		*/
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()) {
			String lists = itr.next();
			
			if(lists.equals("Bike lone")) {
				itr.remove();
			
			}
		}
		System.out.println(list);
		

	
}
}
