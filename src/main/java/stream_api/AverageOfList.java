package stream_api;

import java.util.Arrays;
import java.util.List;

public class AverageOfList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,675,7,53,7,46,7);
        double avgOfList = numbers.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);
        System.out.println(avgOfList);
    }
}
