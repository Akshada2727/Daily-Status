import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Uppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Doe", "Alice", "Bob");

        List<String> nameLst = names.stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());
        System.out.println(nameLst);
    }
}
