package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    //String driverPath = "C:\\Drivers\\Chrome drivers\\Chrome driver 81.0.4044.69\\chromedriver.exe"; //private
    String driverPath = "C:\\Users\\Kristina.Markova\\IdeaProjects\\neptun-automation-tests\\src\\test\\resources\\drivers\\chromedriver.exe"; //work
    String url = "https://setec.mk/index.php";
    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void close_browser() {
        driver.quit();
    }

}
