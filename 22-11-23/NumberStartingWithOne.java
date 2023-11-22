// Given a list of integers, find out all the numbers starting with 1 using Stream functions?


package practice;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream()
		 .map(s -> s + "")
		 .filter(s -> s.startsWith("1"))
		 .forEach(System.out::println);
		 
	}

}
