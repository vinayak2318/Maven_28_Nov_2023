package testng.assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void hardAssert(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement loginTextBox = driver.findElement(By.id("login1"));
        Assert.assertEquals(title, "Rediffmail", "Title should be matched.");
        Assert.assertTrue(loginTextBox.isDisplayed(), "Login text box should be displayed.");
        System.out.println("Hello");
        driver.close();
    }
}

/*
Hard Assert in TestNG:
1) Hard Asserts are those asserts that, stop the test execution when an assert statement fails,
and the subsequent assert statements are therefore not validated.
2) It plays a vital role in projects where we have an element without whose validation,
asserting other elements is useless.
3) One good example in such cases is the login functionality. If I want to see my past orders,
for example, then what is the point of checking this test case when the login validation
already failed? Hard asserts are the default type of asserts in TestNG.

Syntax
Assert.Method(actual, expected)
Assert.Method(actual, expected, message)

*/
