package testng.annotations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsExample {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("Verify Home page");
    }
    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }
}

/*
DependsOnGroups And DependsOnMethods:
1) You may need to invoke methods in a test case in a particular order, or you may want to
share some data and state between methods.
2) This kind of dependency is supported by TestNG, as it supports the declaration of explicit
dependencies between test methods.
3) TestNG allows you to specify dependencies either with −
Using attribute dependsOnMethods in @Test annotations
Using attribute dependsOnGroups in @Test annotations
*/