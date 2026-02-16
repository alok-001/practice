package stream_api;

import java.util.Arrays;
import java.util.List;

public class CountCharactersInList {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("apple","banana","kiwi","orange","grapes");
        int totalCharacters = li.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Total numbers of Characters in the list : "+totalCharacters);
    }
}
