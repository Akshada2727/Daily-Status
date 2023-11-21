package company;
import java.util.*;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();  
	    
		
	    map.put(1,"Aman");  
	    map.put(5,"Raju");  
	    map.put(2,"Jay");  
	    map.put(6,"Ajay");  
	   
	    Set set=map.entrySet(); 
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}  
	

	}


