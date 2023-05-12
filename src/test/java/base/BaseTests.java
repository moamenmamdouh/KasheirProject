package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTests {
    public static void main(String[] args) {
        String baseURL = "https://merchant.kashier.io/signup";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
