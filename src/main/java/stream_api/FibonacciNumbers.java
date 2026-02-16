package stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int termNumber = 10;
        List<Integer> fibonacciNumbers = Stream.iterate(new int[]{0,1}, t-> new int[] {t[1],t[0]+t[1]}).limit(termNumber)
                .map(n->n[0])
                .collect(Collectors.toList());
        System.out.println(fibonacciNumbers);
    }
}
