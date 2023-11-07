package company;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =10;    // primitive datatype
		Integer in = new Integer(10);   // wrapper class obj
        //Integer in = new Integer(j);   // also pass primitive datatype...without passing value/boxing
		//System.out.println(in);
		
		
		int i = in.intValue(); // unboxing
		System.out.println(i);
		
		//Directly assign
		Integer inte = 200;
		//Integer inte = j;    //also assign with variable...autoboxing
		System.out.println(inte);
		
		// convert string value in integer
		
		String str = "1233";
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

}
