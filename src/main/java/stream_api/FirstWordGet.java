package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstWordGet {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Apple","Banana","Orange","Apple","Banana","Orange","kiwi","truth");
        li.stream().findFirst().ifPresent(System.out::println);

    }
}
