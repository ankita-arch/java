package userinput;
import java.util.Scanner;

public class ScannerUserInput {
   public static void main(String[] agrs) {
	   
    Scanner sc = new Scanner(System.in);
    
    String hello = sc.nextLine();
    System.out.println(hello);
    sc.close();
  }
     }