package String;
import java.util.*;

public class RemoveSpace {
	
	public static void main (String[]args){
	        System.out.println("Java program to remove blank space from string ");
	        Scanner sc = new Scanner (System.in);
	        System.out.println ("Please enter a String");
	        String str = sc.nextLine(); 
	        StringBuilder tempStr = new StringBuilder();
	        for(int i = 0; i < str.length(); i++){
	            if(!(str.charAt(i)== ' ')) {        
	                    tempStr.append(str.charAt(i));
	            } 
	        }
	        System.out.println("String After removing space");
	        System.out.println (tempStr);
	    }
	

}
