//Given a list of integers, sort all the values present in it in descending order using Stream functions?

package practice;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;


public class SortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

         myList.stream()
               .sorted(Collections.reverseOrder())
               .forEach(System.out::println);
}


	}


