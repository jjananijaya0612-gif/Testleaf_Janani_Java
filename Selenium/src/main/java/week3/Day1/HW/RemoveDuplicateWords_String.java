package week3.Day1.HW;

public class RemoveDuplicateWords_String {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week";
	
		// Initialize count variable
		int count = 0;
		
		 // Split the string into word
		String [] words = text.split(" ");
		
		// Compare each word with every other word
		
		for(int i=0; i<words.length-1; i++)
		{
			for(int j=i+1; j<words.length-1; j++)
			{
				//insensitive comparison
                  
				if(words[i].equalsIgnoreCase(words[j]))
				{
					words[j] = ""; // Replace duplicate with empty string
					count++;
				}
               
			}
		}
		
		// If duplicates are found
		if(count>1)
		{
			for(int i=0; i< words.length; i++)
			{
				if(!words[i].equals(""))
				{
					System.out.print(words[i]+" ");
				}
			}
		}
	}

}
