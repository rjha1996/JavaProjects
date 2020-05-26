package Ravi.java.StringOperation;

import java.util.HashMap;

public class HashMapDEmo {
	
	

	public static void main(String[] args) {
		
		HashMap<Account, String> map =new HashMap<Account, String>();
		
		
		Account a1 = new Account(1);
		a1.setAccountName("A_one");
		

		
		
		
		Account a2 = new Account(2);
		a2.setAccountName("A_two");
		
		map.put(a1, a1.getAccountName());
		map.put(a2,a2.getAccountName());
		
		a1.setAccountName("Change1");
		a2.setAccountName("Change2");
		
		System.out.println(map.get(a1));
		System.out.println(map.get(a2));
		
		Account a3 = new Account(1);
		
		a3.setAccountName("A_three");
		
		System.out.println(map.get(a3));
		System.out.println(map.isEmpty());

	}

}
