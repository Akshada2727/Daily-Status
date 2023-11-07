package company;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking input from the user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		//int a = sc.nextInt();
		
		float a = sc.nextFloat();
		
		System.out.println("Enter Second number");
		//int b = sc.nextInt();		
		
		float b = sc.nextFloat();		
	    float sum = a+b;
		
		System.out.println("Addition of this two number is");
		System.out.println(sum);
	
//		String str = sc.next();
//		System.out.println(str);		
//	    String str = sc.nextLine();
//	    System.out.println(str);
//		
	
	}

}
