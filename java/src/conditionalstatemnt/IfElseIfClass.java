package conditionalstatemnt;

public class IfElseIfClass {
	public static void main(String[] args) {
		int number = 23;
		 if (number<= 10){
		 System.out.println("number is less than 10");
		 } else if(number>=10&& number<=20){
		System.out.println("number is greater than 10 but less than 20");
		}
	
	     else if(number>=10&&number<=30){
	    	 System.out.println("number is greateer than 20 but less than 30");
	     }
	    	 else {
	    		 System.out.println("number is greater than 30");
	    	 }
	     }
	}

