package practice;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;


public class FirstRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "java articles are awsome";
		
		Character result = input.chars()
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
		        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()  > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
		System.out.println(result);
                
	}

}
