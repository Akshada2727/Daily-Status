// Swap of two numbers without using third variable


package company;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a,b;
		System.out.println("Enter any two numbers ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping "+a+" "+b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping "+a+" "+b );
		

	}

}

// a=a*b;  
// b=a/b;
// a=a/b;

//a=a^b;
//b=a^b;
//a=a^b;



