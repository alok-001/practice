package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","orange","mango","banana","orange","banana","kiwi");
        Set<String> wordSet = new HashSet<>(words);
//        Set<String> wordSet = words.stream().collect(Collectors.toSet());
        System.out.println(wordSet);
    }
}
