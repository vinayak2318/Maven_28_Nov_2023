package testng.annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testCase1() {
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void testCase2() {
        driver.get("https://www.cricbuzz.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void testCase3() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }
}
