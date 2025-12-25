package week3.Day1.HW;

public class ReverseOddWords_String {

	public static void main(String[] args) {

     String test = "I am a software tester";
     
    // Split the string into words
     
     String[] words = test.split(" ");
     
     // Traverse through each word
     
     for(int i=0; i<=words.length-1; i++)
     {
    	 if(i%2 != 0)
    	 {
    		// Convert word to character array
    		 char[] chars = words[i].toCharArray();
    		 
    		// Print the word in reverse using nested loop
    		 for(int j=chars.length-1; j>=0; j--)
    		 {
    			 System.out.print(chars[j]);    			 
    		 }
    		 System.out.print(" ");
    		 }
    	 else
    	 {
    		// Print even position words as it is
    		 System.out.print(words[i] + " ");
    	 }
     }

	}

}
