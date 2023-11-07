package company;
import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter any two numbers ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping "+a+" "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping "+a+" "+b);

	}

}

/*  int a=10, b=20;
 * System.out.println("Before Swapping "+a+" "+b);
 * int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping "+a+" "+b);

 */
