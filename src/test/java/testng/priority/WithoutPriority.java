package testng.priority;
import org.testng.annotations.Test;

public class WithoutPriority {
    @Test(priority = 1)
    public void testScriptA(){
        System.out.println("Test Script A");
    }
    @Test(priority = 2)
    public void testScriptE(){
        System.out.println("Test Script E");
    }
    @Test(priority = -3)
    public void testScriptB(){
        System.out.println("Test Script B");
    }
    @Test
    public void testScriptD(){
        System.out.println("Test Script D");
    }
    @Test(priority = 'a')
    public void testScriptG() {System.out.println("Test Script G");}
    @Test
    public void testScriptC(){
        System.out.println("Test Script C");
    }
    @Test(priority = -6)
    public void testScriptF(){
        System.out.println("Test Script F");
    }
}

/*
Priority in TestNG:-
1) The priorities are an additional option that we can use with the test annotations.
2) This attribute decides the priority of the annotation.
But remember that priority check happens after the annotation check by TestNG.
3) TestNG annotation hierarchy is followed first and then priority-based execution.
4) TestNG runs the test cases in the alphabetical order.
5) By Default, testng priority is zero. (Ex. @Test)
6) You can set your priority as positive & negative number too.(Ex.@Test(priority=4) @Test(priority=-2))
7) You can define priority in character too.(Ex. @Test(priority = 'a')) It will follow ASCII value.
8) You can not define the testng priority like 10.25.
*/
