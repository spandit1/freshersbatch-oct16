package assignment4;

import java.util.Scanner;

public class OperationException {
	  public static void main(String[] args) {
		  try{
			Scanner sc = new Scanner (System.in);
			
		    System.out.print("Input the first number: ");
		    int a = sc.nextInt();
		    
		    System.out.print("Input the second number: ");
		    int b = sc.nextInt();
		    
		    float d = (a/b);
		    
		    System.out.println("result="+d);
			}
		  
		  catch(UnsupportedOperationException e) {
			System.out.println("Can't divide by zero");
			}
	  }
	  
}
