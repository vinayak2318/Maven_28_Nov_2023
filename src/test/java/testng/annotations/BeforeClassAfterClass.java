package testng.annotations;
import org.testng.annotations.*;

public class BeforeClassAfterClass {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod1(){
        System.out.println("Before Method 1");
    }
    @Test
    public void testCase1 (){
        System.out.println("Test Case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }
    @AfterMethod
    public void afterMethod1(){
        System.out.println("After Method 1");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
}

/*
@BeforeClass: This will be executed before first @Test method execution.
It will be executed one only time throughout the test case.

@AfterClass: This will be executed after all test methods in the current class have been run.
*/
