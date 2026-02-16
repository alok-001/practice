package stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList_b {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("apple","banana","kiwi","orange","grapes");
        Collections.reverse(li);
        System.out.println(li);
    }
}
