 //Java 8 program to perform cube on list elements and filter numbers greater than 50.
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);

        integerList.stream()
                   .map(i -> i * i * i)
                   .filter(i -> i > 50)
                   .forEach(System.out::println);
    }
}
