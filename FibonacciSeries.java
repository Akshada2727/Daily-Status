// 0....1...2....3..5

package company;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term,a=0,b=1,c; //addition of last 2 numbers is stored in c variable
		System.out.println("Enter term");
		Scanner sc = new Scanner(System.in);
		term = sc.nextInt();
		
		
		for(int i=1; i<=term; i++)
		{
			System.out.println(a);
			c=a+b;   // c=0+1  =  1
			a=b;     // a = 1
			b=c;     //b = 1
		}

	}

}

