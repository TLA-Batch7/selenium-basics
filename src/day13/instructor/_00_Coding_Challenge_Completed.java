package day13.instructor;

public class _00_Coding_Challenge_Completed {
    /**
     * Until 7:20PM
     *
     * Create a method that takes a String argument.
     * Method should return only initials in caps.
     * Example: input: "tech Lead academy" -> output: TLA
     * Example: input: "I like to jump" -> "ILTJ"
     */

    public static void main(String[] args) {
        System.out.println(getInitials("tech Lead academy"));
        System.out.println(getInitials("I like to jump"));
    }

    public static String getInitials(String str){
        String[] arr = str.split(" ");
        String initials = "";

        for(String each: arr){
            initials += each.substring(0,1);
        }

        return initials.toUpperCase();
    }
}
