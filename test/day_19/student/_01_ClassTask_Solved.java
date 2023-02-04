package day_19.student;

public class _01_ClassTask_Solved {
    /**
     *  1. method returnInitialsInCaps()
     *      Create a method with above name
     *      Method should accept 1 String argument
     *      It should return all initials in caps only
     *      Example: Input -> tech lead Academy
     *              returns -> TLA
     *  2. Create tests to verify if the method is working as expected
     *      Reminder: You can create multiple test cases with different test data
     */

    public String returnInitalsInCaps(String txt){
        if(txt == null || txt.equals("")){
            return "invalid input";
        }

        String[] arr = txt.split(" ");
        String result = "";

        for(String each: arr){
            result += each.charAt(0);
        }
        return result.toUpperCase();
    }

}
