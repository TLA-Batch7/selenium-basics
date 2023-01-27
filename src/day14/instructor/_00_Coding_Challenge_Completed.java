package day14.instructor;

public class _00_Coding_Challenge_Completed {
    /**
     * Write a method that takes a String and
     * returns it reversed.
     *
     * Until 7:15PM
     */
    public static void main(String[] args) {
        System.out.println(reverse("Hello world"));
    }

    public static String reverse(String str){
        //Hello world
        String result = "";

        for(int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }
}
