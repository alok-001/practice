package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInteger {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,3,5,7,9,11,1,3,5,7,9,11,1,2,3,54,5,4);
        List<Integer> uniqueNumbers = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
