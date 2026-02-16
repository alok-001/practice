package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalandromicStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam","racecar","level","Wow","banana");
        List<String> palandromicWords = words.stream()
                .filter(s-> new StringBuilder(s).reverse().toString().equals(s))
                .collect(Collectors.toList());
        System.out.println(palandromicWords);
    }
}
