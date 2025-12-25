package week3.Day2.HW;

public class Find_Intersection {

	public static void main(String[] args) {
     
		//Declare first array
		int array1[]={3,2,11,4,6,7};
		 
		//Declare another array
		int array2[]= {1,2,8,4,9,7}; 
		
		//outer loop for 1st array
		for(int i =0; i<array1.length; i++)
		{
	    //inner loop for 2nd array
			for(int j=0; j<array2.length; j++)
			{
				//Compare both the arrays using a conditional statement
				
				if(array1[i] == array2[j])
             {
			 // Print matching element from first array
	           System.out.println("Matching Element: " + array1[i]);
             }
			}
		}
       
	}

}
