package day04.student;

public class JavaPractice_Solved {
    /**
     * Note: Create a method for each challenge below
     * 1. Basic: Find sum of elements in an array
     * 2. Basic: Print even and odd numbers from an array based on
     * what user wants to print out
     */

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 12, 11, 99, 5, 4};

        JavaPractice_Solved obj = new JavaPractice_Solved();

        //System.out.println(obj.getSum(arr));

        obj.printEvenOrOddNums(arr, "even");
    }

    public void printEvenOrOddNums(int[] arr, String evenOrOdd) {
        if (!evenOrOdd.equalsIgnoreCase("even") && !evenOrOdd.equalsIgnoreCase("odd")){
            System.out.println("Wrong input");
            return;
        }

        for (int num : arr) {
            if (evenOrOdd.equalsIgnoreCase("even")) {
                if (num % 2 == 0)
                    System.out.println(num);
            }else if(evenOrOdd.equalsIgnoreCase("odd")){
                if (num % 2 == 1)
                    System.out.println(num);
            }
        }
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
