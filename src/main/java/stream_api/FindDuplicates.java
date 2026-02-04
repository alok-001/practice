package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,78,1,2,3,4,5,12,132,12,78);
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = li.stream()
                .filter(a->!seen.add(a))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }

}
