package week3.Day1.HW;

public class OddIndex_Uppercase {
	public static void main(String[] args)
	{
		String test = "changeme";
		
		// Convert String to character array
		char[] chars = test.toCharArray();
		
		//loop from end to start
		for(int i = chars.length-1; i>0; i--)
		{
			if(i%2!=0)
			{
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
		
		System.out.println(chars);
		
	}
	
	

}
