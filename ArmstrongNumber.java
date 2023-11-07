package company;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,rem,arm=0;
		
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		c=n;
		
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
			if(c==arm)
				System.out.println("Armstrong number ");
			else
				System.out.println("Not Armstrong number ");
				
		

	}

}
