package testng.parameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization {
    public WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodTestDemo(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")){
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

            System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver(firefoxOptions);
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please select correct browser");
        }
    }

    @Parameters({"coursename" , "cityname"})
    @Test
    public void verifyGoogleSearch(String coursename, String cityname) throws InterruptedException {
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(coursename + cityname);
        googleSearchBox.sendKeys(Keys.ENTER);
        driver.close();
    }
}
