package day_18.instructor;

public class _01_BasicMath_Completed {
    /**
     *  0. ReadMe file
     *
     *  1. Create 2 methods to handle basic math calculations
     *      add, subtract.
     *  2. Validate all 2 methods in main method with if statements
     *  3. Validate with TestNG (add() and subtract() methods only)
     *  4. ClassTask 1
     */
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 4;

        _01_BasicMath_Completed basic = new _01_BasicMath_Completed();

        int expected1 = num1 + num2;
        int actual = basic.add(num1, num2);

        if(expected1 == actual){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        int expected2 = num1 - num2;
        int actual2 = basic.subtract(num1, num2);

        if(expected2 == actual2){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }


}
