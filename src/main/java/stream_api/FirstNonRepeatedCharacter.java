package stream_api;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input= "Saurabh";
        Map<Character,Integer> characterCount = new LinkedHashMap<>();
        for(char ch : input.toCharArray()){
            characterCount.put(ch, characterCount.getOrDefault(ch,0)+1);
        }
        characterCount.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
