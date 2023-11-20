package company;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList al=new ArrayList();  // creating array list
		 al.add("Akshada");                // adding elements    
		 al.add("Akansha");
		 Iterator itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
		 }
		 
	}


