package testng.annotations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
    @Test(dependsOnGroups = "Smoke")
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test
    public void verifyCashbackOffer(){
        System.out.println("Verify Cashback Offer");
    }
    @Test(groups = {"Smoke"}, alwaysRun = true)
    public void verifyHomePage(){
        System.out.println("Verify Home page");
    }
    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }
}
