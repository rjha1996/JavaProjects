import java.util.Arrays;

public class AnagramCheckInString {

	static boolean isAnagram(String str1, String str2)
	{
		
		char [] string1 =str1.toCharArray();
		char [] string2 = str2.toCharArray();
		
		int num1= str1.length();
		int num2= str2.length();
		
		if(num1 != num2)
			return false;
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		
		for(int i= 0; i< num1; i++)
			if(string1[i] != string2[i])
				return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		
		
		if(isAnagram("ravi","vair"))
			System.out.println("yes");
		else
			System.out.println("No");
			
		
	}
}
