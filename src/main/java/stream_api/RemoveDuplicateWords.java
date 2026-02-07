package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Apple","Banana","Orange","Apple","Banana","Orange","kiwi","truth");
        List<String> uniqueWordList = li.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueWordList);
    }
}
