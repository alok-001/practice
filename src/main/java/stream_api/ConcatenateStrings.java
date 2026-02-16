package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Orange","Kiwi","Grapes");
        String concate = words.stream()
                .collect(Collectors.joining(","));
        System.out.println(concate);
    }
}
