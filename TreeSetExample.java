package company;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet&amp;amp;lt;String&amp;amp;gt; al=new TreeSet&amp;amp;lt;String&amp;amp;gt;();  
		al.add("Riya");                            
		al.add("Sam");
		al.add("Rucha");
		Iterator&amp;amp;lt;String&amp;amp;gt; itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		}
		}
	
