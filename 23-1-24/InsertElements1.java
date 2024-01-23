package Array;
import java.util.*;  

public class InsertElements1 {
	
	public static void main(String[] args) {
			int loc;
			Scanner sc = new Scanner(System.in);
	        System.out.println("Java Program to insert element at given index of Array");
	        System.out.print("Enter the size of array: ");
	        int size = sc.nextInt();
	        int arr[] = new int[size+1];
	        for(int i=0; i<size; i++) {
	            System.out.print("Please give value for index "+ i +" : ");
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter the index where you want to insert:");
	        loc = sc.nextInt();
	        for (int i = size-1; i >= loc; i--){
	            arr[i+1] = arr[i];
	        }
	        System.out.print("Enter the element to insert at index "+loc+" : ");
	        arr[loc] = sc.nextInt();
	        System.out.println("Array After Inserting "+ arr[loc] +" at index "+loc+" : ");
	        for(int i=0; i<size+1; i++)
	        {
	            System.out.println(arr[i]);
	        }
		}
	

}
