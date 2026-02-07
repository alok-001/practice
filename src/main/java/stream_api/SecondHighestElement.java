package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,56,2,89,234,343);
        Optional<Integer> secondHighestNum = numbers.stream()
                .sorted((a,b)-> b.compareTo(a))
                .skip(1)
                .findFirst();
        secondHighestNum.ifPresent(System.out::println);
//        System.out.println(secondHighestNum.get());
    }
}
