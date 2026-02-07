package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstThreeElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Banana", "Orange", "Kiwi", "Grapes");
        List<String> newList = words.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
