package stream_api;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxFreqElement {
    public static void main(String[] args) {
        String str="Apple";
        TreeMap<Character, Long> treeMap =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.<Character>identity(),
                                () -> new TreeMap<>(Comparator.reverseOrder()),
                                Collectors.counting()
                        ));
        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
    }
}
