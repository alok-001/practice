package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsets {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(Integer ele : li){
            List<List<Integer>> newSubsets =new ArrayList<>();

            for(List<Integer> subset : subsets){
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(ele);
                newSubsets.add(newSubset);
            }
            subsets.addAll(newSubsets);
        }
        System.out.println(subsets);
    }
}
