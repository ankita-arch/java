package WhileLoop;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int temp= n;
     int sum=0;
     while (temp>0) {
    	 int lastdigit =temp%10;
    	 temp/=10;
    	  
    	 sum += lastdigit;
    	 System.out.println(lastdigit+" "+temp+" "+sum);
    	 
     }
     System.out.println("the sum of the digits of"+n +"is"+sum);
     
     
	}
	
}
