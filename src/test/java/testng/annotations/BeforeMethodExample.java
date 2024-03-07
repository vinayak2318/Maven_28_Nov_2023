package testng.annotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample {

    @BeforeMethod
    public void beforeMethod1(){
        System.out.println("Before Method 1");
    }
    @Test
    public void case1 (){
        System.out.println("Case 1");
    }
    @Test
    public void case2(){
        System.out.println("Case 2");
    }
    @AfterMethod
    public void afterMethod1(){
        System.out.println("After Method 1");
    }
}

/*
TestNG Annotations:-
@Test : Marks a class or a method as a part of the test.
@BeforeMethod: This will be executed before every @test annotated method.
@AfterMethod: This will be executed after every @test annotated method.
*/
