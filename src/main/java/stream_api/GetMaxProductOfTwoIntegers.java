package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Sample Test cases:
case 1: Input with Positive and Negative Numbers       Input: [-5,-6,1,2]    output: 30
case 2: Input with mixed Positive and Negative Numbers Input: [3,5,-2,9,1,7] output: 63
case 3: Input with only two Numbers                    Input: [3,4]          output: 12
case 4: Input with duplicate Numbers                   Input: [3,3,5,7]      output: 35
case 5: Input with all Negative Numbers                Input: [-3,-4,-5]     output: 20
case 6: Input with one element                         Input: [5]            output: List must contain at least two number
 */
public class GetMaxProductOfTwoIntegers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-5,-6,1,2);
        if(nums==null || nums.isEmpty()){
            System.out.println("List is empty.....");
            return;
        }
        if(nums.size()<2){
            System.out.println("List must contain at least two numbers.");
            return;
        }
        Optional<Integer> maxProduct = nums.stream()
                .flatMap(i-> nums.stream().filter(j->!i.equals(j)).map(j->i*j))
                .max(Integer::compareTo);
        System.out.println("Maximum product of two Integer: "+maxProduct.get());

    }
}
