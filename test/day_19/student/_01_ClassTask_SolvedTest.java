package day_19.student;


import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_ClassTask_SolvedTest extends _01_ClassTask_Solved {

    @Test
    public void test1(){
        String testData = "tech lead Academy";
        String expected = "TLA";

        _01_ClassTask_Solved task1 = new _01_ClassTask_Solved();

        String actual = task1.returnInitalsInCaps(testData);

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        String testData = "blue";
        String expected = "B";

        _01_ClassTask_Solved task1 = new _01_ClassTask_Solved();

        String actual = task1.returnInitalsInCaps(testData);

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        String testData = "tech lead 345test academy";
        String expected = "TL3A";

        _01_ClassTask_Solved task1 = new _01_ClassTask_Solved();

        String actual = task1.returnInitalsInCaps(testData);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test4(){
        String testData = null;
        String expected = "invalid input";

        _01_ClassTask_Solved task1 = new _01_ClassTask_Solved();

        String actual = task1.returnInitalsInCaps(testData);

        Assert.assertEquals(actual,expected);
    }

}