package day_18.student;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_ClassTaskTest_SolvedTest {
    @Test
    public void testMultiply() {
        int num1 = 13;
        int num2 = 4;

        _01_ClassTask_Solved basic2 = new _01_ClassTask_Solved();

        int expected = num1 * num2;
        int actual = basic2.multiply(num1, num2);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDivide(){
        double num1 = 12;
        double num2 = 3;

        _01_ClassTask_Solved basic2 = new _01_ClassTask_Solved();

        double expected = num1 / num2;
        double actual = basic2.divide(num1,num2);

        Assert.assertEquals(actual,expected);
    }
    }
