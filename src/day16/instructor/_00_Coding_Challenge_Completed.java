package day16.instructor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class _00_Coding_Challenge_Completed {
    /**
     * Write a method that takes a String of words
     * and returns only unique ones in an array.
     * Example: "One, two, three, four, two, one" -> [three, four]
     *
     * Try to finish until 9:30AM
     */

    public static void main(String[] args) {
        String test = "One, two, three, four, two, one";


    }

    public static String[] uniqueWithSet(String str){
        String[] words = str.split(", ");
        Set<String> set = new HashSet<>();

        for(String each: words){
            set.add(each);
        }

        return words;
    }

    public static String[] uniqueWithoutSet(String str){
        String[] words = str.split(", ");

        return words;
    }
}
