import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Character> charList = Arrays.asList('A', 'B', 'C', 'A', 'E', 'B');
        Map<Character, Long> map = charList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
