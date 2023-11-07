package company;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Arithmatic operators... Arithmatic operators cannot work with boolean..1+true
		
//		int a = 4;
//		int b = 6 + a;
//		
		//int b = 6 - a;
//		System.out.println(b);
		
		int a = 4;
	//  int b = 6 % a;        // modulo operator
		
		int b = 9;
		b += 3;                //9 +3    // assignment operator
		System.out.println(b);
		
		//System.out.println(6==6); // comparison operator
		
		System.out.println(64>6);   // comparison operator
		
		System.out.println(64>5 && 64>8); // logical && operator
		System.out.println(64>5 && 64<8); // logical && operator
		
        System.out.println(64>5 || 64>98); // in both condition 1 condition is true 
  //then the result is true
	}
}
