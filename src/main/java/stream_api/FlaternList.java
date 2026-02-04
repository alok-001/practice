package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlaternList {
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(1,2,3);
        List<Integer> li2 = Arrays.asList(4,5,6);
        List<Integer> li3 = Arrays.asList(7,8,9);
        List<List<Integer>> li = Arrays.asList(li1,li2,li3);
        List<Integer> flaternList = li.stream()
                .flatMap(List :: stream)
                .collect(Collectors.toList());
        System.out.println(flaternList);
    }
}
