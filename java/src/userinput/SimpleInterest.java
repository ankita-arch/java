package userinput;
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
		int principal = sc.nextInt();
		Float rate =sc.nextFloat();
		int time =sc.nextInt();
		 Float simpleinterest = principal*rate*time/100 ;
		 
		 System.out.println("the simple interest is"+ simpleinterest);
		  sc.close();
		 
		

}
       }