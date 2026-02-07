package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectOddNumbersToSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,54,65,76,89,67,55,66,120,12);
        Set<Integer> oddNumbers = numbers.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toSet());
        System.out.println(oddNumbers);
    }
}
