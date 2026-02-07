package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringByCharacter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","Anil","Alok","anish","pear","grapes","kiwi","orange");
        List<String>  filterWords = words.stream()
                .filter(word-> word.contains("a") || word.contains("A"))
                .collect(Collectors.toList());
        System.out.println(filterWords);
    }
}
