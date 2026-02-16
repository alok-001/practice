package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveLessThanFive {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,5,6,10,22,3,5);
        List<Integer> filterNumbers = nums.stream()
                .filter(n->n>=5)
                .collect(Collectors.toList());
        System.out.println(filterNumbers);
    }
}
