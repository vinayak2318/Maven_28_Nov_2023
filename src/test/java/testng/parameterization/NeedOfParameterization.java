package testng.parameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {
/*    String coursename = "Selenium";
    String cityname = "Pune";*/

    @Test
    public void verifyGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("Selenium" + "Pune");
        googleSearchBox.sendKeys(Keys.ENTER);
        driver.close();
    }
/*    @Test
        public void verifyGoogleSearch_2(String coursename, String cityname) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(coursename + cityname);
        googleSearchBox.sendKeys(Keys.ENTER);
        driver.close();
    }*/
}
