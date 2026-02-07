package stream_api;

import java.util.Arrays;
import java.util.List;

public class NoNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(5,12,34,53,56,1,3);
        List<Integer> li2 = Arrays.asList(5,12,-34,53,56,-1,3);
        boolean noNegativeNumbers = li1.stream()
                .noneMatch(n->n<0);
        System.out.println(noNegativeNumbers);
        System.out.println(li2.stream().noneMatch(n->n<0));

    }
}
