package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenOdd {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        Map<Boolean,List<Integer>> partitioned = li.stream()
                        .collect(Collectors.partitioningBy(a -> a%2==0));

        System.out.println("List of Even numbers: "+partitioned.get(true));
        System.out.println("List of Odd numbers: "+partitioned.get(false));
//        List<Integer>evenList = li.stream()
//                .filter(a -> a%2==0)
//                .collect(Collectors.toList());
//        List<Integer>oddList = li.stream()
//                .filter(a -> a%2==1)
//                .collect(Collectors.toList());
//        System.out.println("List of Even numbers: "+evenList);
//        System.out.println("List of Odd numbers: "+oddList);
    }
}
