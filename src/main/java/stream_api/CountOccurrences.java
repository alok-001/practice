package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","orange","apple","grapes","apple","banana");
        Map<String,Integer> occurrence = words.stream()
                .collect(Collectors.groupingBy(
                        word->word, Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue)));
        System.out.println(occurrence);

    }
}
