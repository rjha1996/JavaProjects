import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DeseralizedDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = null;
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("Mapfile.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			try {
				map = (HashMap<Integer, String>) (Collections.synchronizedMap(new HashMap<Integer, String>())); ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();
			fin.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set set = map.entrySet();
		 
		
			
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry pair= (Entry) i.next();
			System.out.print(pair.getKey()+" ");
			System.out.println(pair.getValue());
			
		
		}
	}

}
