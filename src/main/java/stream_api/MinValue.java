package stream_api;

import java.util.Arrays;
import java.util.List;

public class MinValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(34,23,6,8,-1,3,6,78,-90);
        int minValue= numbers.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
        System.out.println(minValue);
    }
}
