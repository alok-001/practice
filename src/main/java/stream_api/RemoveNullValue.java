package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullValue {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Apple", "Orange", null, "grapes", null,"kiwi");
        List<String> nonNullWords = li.stream()
                .filter(a-> a!=null)
                .collect(Collectors.toList());
        System.out.println(nonNullWords);
    }
}
