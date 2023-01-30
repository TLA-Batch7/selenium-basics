package day16.instructor;

import java.util.*;

public class _00_Coding_Challenge_Completed {
    /**
     * Write a method that takes a String of words
     * and returns only unique ones in an array.
     * Example: "One, two, three, four, two, one" -> [three, four]
     *
     */

    public static void main(String[] args) {
        String test = "One, two, three, four, two, one, seven, four";

        System.out.println(Arrays.toString(uniqueWithoutSet(test)));

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
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> hasDuplicates = new ArrayList<>();

        for(int i = 0; i < words.length; i++){

            if (i != words.length - 1){

                for(int j = i + 1; j < words.length; j++){
                    if (words[i].equalsIgnoreCase(words[j]))
                        hasDuplicates.add(words[i].toLowerCase());
                }
            }
            if (!hasDuplicates.contains(words[i].toLowerCase()))
                result.add(words[i]);
        }

        return result.toArray(new String[result.size()]);
    }
}
