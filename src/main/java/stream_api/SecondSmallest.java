package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondSmallest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,4,3,6,10,2,5);
        Optional<Integer> secondNumber = nums.stream()
                .sorted()
                .skip(1)
                .findFirst();
        secondNumber.ifPresent(System.out::println);
    }
}
