//

package practice;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class SortValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		 myList.stream()
         .sorted()
         .forEach(System.out::println);
		
	}

}
