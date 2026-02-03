package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12,23,423,434,434,32,1324,1234,1324,12,33,44);
        Optional<Integer> maxValue = li.stream()
                .max(Integer::compareTo);
        System.out.println(maxValue);
        int maxInt = maxValue.orElse(Integer.MIN_VALUE);
//        int maxInt = maxValue.get(); // this fill also work
        System.out.println(maxInt);
    }
}
