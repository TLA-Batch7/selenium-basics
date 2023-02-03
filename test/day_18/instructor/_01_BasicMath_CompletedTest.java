package day_18.instructor;

import org.testng.Assert;
import org.testng.annotations.Test;


public class _01_BasicMath_CompletedTest {

    @Test
    public void testAdd() {
        int num1 = 13;
        int num2 = 4;

        _01_BasicMath_Completed basic = new _01_BasicMath_Completed();

        int expected = num1 / num2;
        int actual = basic.add(num1, num2);

        Assert.assertEquals(actual, expected);

//        if(expected == actual){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Fail");
//        }
    }

    @Test
    public void testSubtract() {
        int num1 = 13;
        int num2 = 4;

        _01_BasicMath_Completed basic = new _01_BasicMath_Completed();

        int expected2 = num1 - num2;
        int actual2 = basic.subtract(num1, num2);

        Assert.assertEquals(actual2, expected2);
//        if(expected2 == actual2){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Fail");
//        }
    }
}