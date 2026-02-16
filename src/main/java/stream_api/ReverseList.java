package stream_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("apple","banana","kiwi","orange","grapes");
        List<String> reverseList = li.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),list ->{
                    Collections.reverse(list);
                    return list;
                }));
        System.out.println(reverseList);
    }
}
