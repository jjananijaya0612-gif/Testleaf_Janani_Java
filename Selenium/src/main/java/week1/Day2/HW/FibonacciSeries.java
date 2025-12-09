package week1.Day2.HW;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

      // Fibonacci series output – 0, 1, 1, 2, 3, 5, 8, and 13
	  // input(range): 8 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the range: ");
       int range = sc.nextInt();
       
       int a = 0;  int b = 1;
       
       System.out.print("FibonacciSeries" + a);
       if (range >=1)
       {
    	   System.out.print("," + b);
    	   
       }       
 
        
        for(int sum = a+ b; sum<=range; sum = a+b)
        {
        	System.out.print("," + sum);
        	a=b;
        	b= sum;
        }
       sc.close();
	}
}
