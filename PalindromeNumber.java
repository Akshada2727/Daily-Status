package company;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,rev=0;
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		
		int org_num = num;
		 
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println(org_num+"  palindrome Number");
		}
		else
		{
			System.out.println(org_num+" Not palindrome Number");
		}

	}

}
