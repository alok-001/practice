package stream_api;

import java.util.Arrays;
import java.util.List;

public class ProductOfList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int product = nums.stream()
                .reduce(1, (a,b)->a*b);
        System.out.println(product);
    }
}
