package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> li  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = li.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
