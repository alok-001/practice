package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> ans = li.stream()
                .filter(a -> a%2==0)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
