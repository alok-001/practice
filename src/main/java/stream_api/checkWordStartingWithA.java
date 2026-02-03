package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class checkWordStartingWithA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","Anil","Alok","anish","pear","grapes","kiwi","orange");
        List<String > wordsStartingWithA = words.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .collect(Collectors.toList());
        if(!wordsStartingWithA.isEmpty()){
            System.out.println("Words starting with 'A' or 'a':"+wordsStartingWithA);
        }else{
            System.out.println("No words Starts with 'A' or 'a'");
        }

        List<String > wordsStartingWithC = words.stream()
                .filter(s-> s.startsWith("C") || s.startsWith("c"))
                .collect(Collectors.toList());
        if(!wordsStartingWithC.isEmpty()){
            System.out.println("Words starting with 'C' or 'c':"+wordsStartingWithC);
        }else{
            System.out.println("No words Starts with 'C' or 'c'");
        }
    }
}
