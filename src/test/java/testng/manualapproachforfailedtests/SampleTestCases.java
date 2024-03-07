package testng.manualapproachforfailedtests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCases {

    @Test
    public void verifyLogin1(){
        Assert.assertTrue(true);
        System.out.println("Verify Login1");
    }

    @Test
    public void verifyLogin2(){
        Assert.assertTrue(false);
        System.out.println("Verify Login 2");
    }

    @Test
    public void verifyHomePage(){
        System.out.println("Verify Home page");
    }

    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }

    @Test
    public void verifyMyCashbackOffers(){
        System.out.println("Verify My Cashback Offers");
    }
}
