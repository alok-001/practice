package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,23,342,43);
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrimeNumber)
                .collect(Collectors.toList());
        System.out.println(primeNumbers);
    }
    public static boolean isPrimeNumber(int num){
        if(num==2) return true;
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
