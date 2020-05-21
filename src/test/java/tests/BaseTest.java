package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    String driverPath = "C:\\Users\\Kristina.Markova\\IdeaProjects\\neptun-automation-tests\\src\\test\\resources\\drivers\\chromedriver.exe";
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
        driver.close();
    }


}
