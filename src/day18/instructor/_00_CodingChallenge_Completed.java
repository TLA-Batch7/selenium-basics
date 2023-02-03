package day18.instructor;

import java.util.HashMap;
import java.util.Map;

public class _00_CodingChallenge_Completed {
    /**
     * Time to complete the assignment: 30min
     * Write a program take a number as an argument.
     * Program should count how many times each number was repeated.
     * Example: 2432565 -> 2=2, 4=1, 3=1, 5=2, 6=1
     * Example: 111123443 -> 1=4, 2=1, 3=2, 4=2
     * Example: 22 -> 2=2
     * Example: 145 -> 1=1, 4=1, 5=1
     */

    public static void main(String[] args) {
        System.out.println(findNumberCount(2432565));
        System.out.println(findNumberCount(222233400));
    }

    public static Map<Integer, Integer> findNumberCount(int num){
        Map<Integer, Integer> map = new HashMap<>();

        while(num > 0){
            int temp = num % 10;

            if (!map.containsKey(temp)){
                map.put(temp, 1);
            }else {
                map.put(temp, map.get(temp) + 1);
            }
            num = num / 10;
        }

        return map;
    }
}
