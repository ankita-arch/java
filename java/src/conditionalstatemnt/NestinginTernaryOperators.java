package conditionalstatemnt;

public class NestinginTernaryOperators {
	public static void main(String[] args) {
		int a=120,b=40,c=90;
		int result=0;
		result =a>b?a>c?a:c:b>c?b:c;
		System.out.println("largerst of three number is"+ result);
	}

}
