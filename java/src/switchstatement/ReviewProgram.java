package switchstatement;

public class ReviewProgram {
    public static void main(String[] args) {
    	int ratings=5;
    	switch(ratings) {
    	case 1 :
    	case 2 :
    		System.out.println("bad review");
    		break;
    	case 3:
    		System.out.println("average review");
    		break;
    	case 4:
    	case 5:
    		System.out.println("good review");
    		
    	
    }
    }
}
