package testng.manualapproachforfailedtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase2 {
    @Test
    public void verifyLogin2(){
        Assert.assertTrue(false);
        System.out.println("Verify Login 2");
    }

    @Test
    public void verifyHomePage(){
        System.out.println("Verify Home page");
    }
}
