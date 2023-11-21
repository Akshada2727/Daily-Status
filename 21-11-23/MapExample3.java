//comparingByKey()



package company;
import java.util.*;

public class MapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Abhishek");    
	      map.put(101,"Vishal");    
	      map.put(102,"Reva");   
	             
	      map.entrySet()  
	     
	      .stream()  
	     
	      .sorted(Map.Entry.comparingByKey())  
	      
	      .forEach(System.out::println);  
	 }  
	
	}


