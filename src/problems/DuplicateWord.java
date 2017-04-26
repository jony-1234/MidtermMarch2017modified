package problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] strArray = st.split(" ");
        float totalChars = 0;
        for(String s : strArray){
            totalChars += s.length();
        }
        float words = strArray.length;
        float averageWordLength = (float)(totalChars/words);
        System.out.println("Average word of length: "+averageWordLength);

        Set<String> duplicates = duplicateWords(st);
        System.out.println("input : " + st);
        System.out.println("output : " + duplicates); }
    //Method to find duplicate words in a Sentence or String
    public static Set<String> duplicateWords(String input){
        if(input == null || input.isEmpty()){
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();
        for(String word : words){
            if(!set.add(word)){
                duplicates.add(word); }
        }
        return duplicates;
    }
//average word of length


}


