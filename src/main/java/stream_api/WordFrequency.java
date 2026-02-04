package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Apple","Banana","Banana","Orange","Kiwi","Apple","apple","Banana");
        Map<String,Long> freqMap = li.stream()
                .collect(Collectors.groupingBy(word -> word,Collectors.counting()));
        System.out.println(freqMap);
    }
}
