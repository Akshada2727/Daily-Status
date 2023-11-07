package company;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		System.out.println("Enter any Number ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.print("Prime Number ");
		else
			System.out.print(" Not Prime Number  ");

	}

}
