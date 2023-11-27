//Write a Java 8 program to sort an array and then convert the sorted array into Stream?

import java.util.Arrays;
public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= { 99, 55, 203, 99, 4, 91 };
     Arrays.parallelSort(arr);
     
     Arrays.stream(arr).forEach(n -> System.out.print(n + " "));

	}

}
