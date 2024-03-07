package testng.annotations;
import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 1000, invocationTimeOut = 5)
    public void iCountExample(){
        System.out.println("I Count Method");
    }
}

/*
 InvocationCount in TestNG:
TestNG supports multi-invocation of a test method, i.e., a @Test method can be invoked
multiple times sequentially or in parallel.
If we want to run single @Test 10 times at a single thread, then invocationCount can be used.
Ex. @Test(invocationCount = 10)

InvocationTimeOut in TestNG
This refers to the maximum number of milliseconds a method should take for all the
invocationCount to complete.
This attribute will be ignored if invocationCount is not specified.
Eg: @Test(invocationCount =7,invocationTimeOut = 30)
*/