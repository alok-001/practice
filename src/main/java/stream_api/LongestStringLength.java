package stream_api;

import java.util.Arrays;
import java.util.List;

public class LongestStringLength {
    public static void main(String[] args) {
        List<String> li  = Arrays.asList("Apple","Banana","Kiwi","");
        int longStrLength = li.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(longStrLength);
    }
}
