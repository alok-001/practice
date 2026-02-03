package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","string","spring","html","kubernates","Kafka");
        List<String> UpperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(UpperCaseWords);
    }
}
