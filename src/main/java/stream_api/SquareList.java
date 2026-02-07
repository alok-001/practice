package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,12,34,56,778);
        List<Integer> squaredList = li.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(squaredList);

    }
}
