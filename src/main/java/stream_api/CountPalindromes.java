package stream_api;

import java.util.Arrays;
import java.util.List;

public class CountPalindromes {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam","racecar","apple","level","wow","banana");
        long count = words.stream()
                .filter(s -> new StringBuilder(s).reverse().toString().equals(s))
                .count();
        System.out.println(count);

    }
}
