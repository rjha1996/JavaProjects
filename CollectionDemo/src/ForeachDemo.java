import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForeachDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0; i<=10; i++) {
			
			list.add(i);
			
		}
		
		/*Iterator<Integer> iterator= list.iterator();
		while(iterator.hasNext())
		{
			Integer i = iterator.next();
			System.out.println("values of i:"+ i);
		}*/
		
		
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("form foreach loop");
				
			}
			
		});
		
		MyConsumer action = new MyConsumer();
		list.forEach(action);
	}


}

class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}
