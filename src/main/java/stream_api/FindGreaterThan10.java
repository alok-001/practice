package stream_api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindGreaterThan10 {
    public static void main(String[] args) {
        List<Integer> li  = Arrays.asList(1,3,5,7,3,61,23,34,1,54,64,2,4,56,89,1234,4344,5);
        List<Integer> ListGreaterThan10 = li.stream()
                .filter(n->n>10)
                .collect(Collectors.toList());
        System.out.println(ListGreaterThan10);
    }
}
