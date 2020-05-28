package forloopsexamples;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		boolean isprime=true;
		//for(int i=2;i<2;i++) {
		for(int i=2; i * i<n; i++) {
			if(n % i ==0) {
				isprime=false;
				break;
			}
			
		
		System.out.println("isprime"+ isprime);
		}
	}
}


