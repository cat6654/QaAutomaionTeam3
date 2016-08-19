package group_hometasks.task1.part3_5;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by adombrovskiy on 8/18/2016.
 */
public class CharDistribution extends InputOperations {
    public static void main(String[] args){
        String rawInput = inputData();
        DistributeChars(rawInput);
    }

    public static void DistributeChars(String input){
        CharDistribution DS = new CharDistribution();
        DS.ProcessInput(input);
    }

    public void ProcessInput(String input){
        char[] inputElements = input.toCharArray();
        //Creating collection of input chars and their distribution
        Map<Character, Integer> charsDistribution = new LinkedHashMap<>();
        for (char element : inputElements)
        {
            if(charsDistribution.containsKey(element))
                charsDistribution.put(element, charsDistribution.get(element)+1);
            else
                charsDistribution.put(element, 1);
        }
        //Sorting out collection by value in descending order
        Map<Character, Integer> result = sortByValue(charsDistribution);

        //Printing our collection
        Set<Character> Keys = result.keySet();
        Character[] KeysArr = Keys.toArray(new Character[Keys.size()]);
        for(char currentElement : KeysArr)
            System.out.println("Key: "+currentElement+" Value: "+charsDistribution.get(currentElement));
    }

    private static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue( Map<K, V> map )
    {
        //creating collection for sorted members of original collection
        Map<K, V> result = new LinkedHashMap<>();

        // using Stream to sort collection members
        Stream<Map.Entry<K, V>> st = map.entrySet().stream();
        st.sorted( Map.Entry.comparingByValue(Comparator.reverseOrder()) )
                .forEachOrdered( e -> result.put(e.getKey(), e.getValue()) );

        // returning collection with sorted members
        return result;
    }
}
