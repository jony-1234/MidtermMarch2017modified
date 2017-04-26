package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String s1 = "cat";
        String s2 = "tac";
        System.out.println("Anagram?? :"+Anagram(s1, s2));
    }

    private static boolean Anagram(String a, String b){

        //if both string is null, then considering it as anagram.
        if(a==b){
            return true;
        }

        //if any one string is null, then they are not anagram.
        if(a==null || b==null)
            return false;

        //If length of both strings are not same then obviously they are not anagrams.
        if(a.length()!=b.length())
            return false;

        char[] aArr = a.toLowerCase().toCharArray();
        char[] bArr = b.toLowerCase().toCharArray();

        // An array to hold the number of occurrences of each character
        int[] counts = new int[26];

        for (int i = 0; i < aArr.length; i++){
            counts[aArr[i]-97]++;  // Increment the count of the character at respective position
            counts[bArr[i]-97]--;  // Decrement the count of the character at respective position
        }

        // If the strings are anagrams, then counts array will be full of zeros not otherwise
        for (int i = 0; i<26; i++){
            if (counts[i] != 0)
                return false;
        }

        return true;
    }

}

