package company;
import java.util.*; 

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList<String> al = new LinkedList<String>();
		 al.add("Akshada");                // adding elements    
		 al.add("Akansha");
		 al.add("Abhi");
		 al.add("abc");
		 
		 
		 Iterator<String> itr= al.iterator();
		 while(itr.hasNext()){ 
	            System.out.println(itr.next());

	}

}
}