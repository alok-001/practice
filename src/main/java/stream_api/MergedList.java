package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedList {
    public static void main(String[] args) {
        List<String> li1 = Arrays.asList("Apple","Orange","Banana");
        List<String> li2 = Arrays.asList("Kiwi","Grapes","pear");
        List<String> mergedList = Stream.concat(li1.stream(),li2.stream())
                .collect(Collectors.toList());
        System.out.println(mergedList);
    }
}
