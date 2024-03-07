package testng.annotations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledFalse {
    @Test(groups = "Smoke")
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test(enabled = false)          //This test case will not be counted. Bypassed directly.
    public void verifyCashbackOffer(){
        System.out.println("Verify Cashback Offer");
    }
    @Test(dependsOnGroups = {"Smoke"})
    public void verifyHomePage(){
        System.out.println("Verify Home page");
    }
    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }
}

/*
Disable a Test with @Test (enabled=false):
1) It happens that our code is not ready, and the test case written to test that
method/code fails.
2) In such cases, annotation helps to disable this test case.
3) If a test method is annotated with @Test(enabled = false), then the test case that is
not ready to test is bypassed.
Ex. @Test(enabled = false)
*/
