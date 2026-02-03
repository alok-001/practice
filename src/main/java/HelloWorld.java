import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String str = "aaajebeuuankkajdhsbkbkbd";




        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        long sum = list.stream()
                .distinct()
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("Sum of distinct elements: " + sum);
    }
}
