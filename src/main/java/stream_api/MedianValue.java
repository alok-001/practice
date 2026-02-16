package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MedianValue {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,5,7,9,11);
        List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());
        int size= nums.size();
        Double median = size%2==0? (sortedNums.get(size/2 -1)+sortedNums.get(size/2))/2.0 :sortedNums.get(size/2);
        System.out.println(median);
    }
}
