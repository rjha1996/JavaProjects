import java.util.Arrays;

public class AnagramCheck {

	static boolean isAnagram(char[] str1, char[] str2)
	{
		int num1= str1.length;
		int num2= str2.length;
		
		if(num1 != num2)
			return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		
		for(int i= 0; i< num1; i++)
			if(str1[i] != str2[i])
				return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		char str1[] = {'r','a','v','i'};
		char str2[] = {'a','v','i','r'};
		
		if(isAnagram( str1, str2))
			System.out.println("yes");
		else
			System.out.println("No");
			
		
	}

}
