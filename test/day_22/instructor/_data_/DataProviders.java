package day_22.instructor._data_;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "displayOptions")
    public Object[] data01(){
        return new Object[]{"10", "25", "50", "All"};
    }

    @DataProvider(name = "users")
    public Object[][] data02(){
        Object[][] data = new Object[3][5];
        data[0][0] = "John";
        data[0][1] = "Smith";
        data[0][2] = "111-111-1111";
        data[0][3] = "j.smith@test.com";
        data[0][4] = "Mentor";

        data[1][0] = "Sam";
        data[1][1] = "Blue";
        data[1][2] = "222-222-2222";
        data[1][3] = "sam.smith@test.com";
        data[1][4] = "Student";

        data[2][0] = "Aria";
        data[2][1] = "Brown";
        data[2][2] = "333-333-3333";
        data[2][3] = "aria.smith@test.com";
        data[2][4] = "Instructor";

        return data;
    }
}
