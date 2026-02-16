package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Kiwi","Mango","Banana","PineApple","Grapes","Orange");
        List<String> sortedByLength = words.stream()
                .sorted((s1,s2) -> Integer.compare(s1.length(),s2.length()))
                .collect(Collectors.toList());
        System.out.println(sortedByLength);

    }
}
