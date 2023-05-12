import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationDefinitions {

    private WebDriver driver;
    private String pageTitle;
    private String baseURL = "https://merchant.kashier.io/en/signup";
    private WebElement fullNameField;
    @Given("applicant navigates to registration page")
    public void applicantNavigatesToRegistrationPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseURL);
    }

    @When("applicant checks the registration page title")
    public void applicantChecksTheRegistrationPageTitle() {
        pageTitle = driver.getTitle();
    }

    @Then("title is matching the one available in the design")
    public void titleIsMatchingTheOneAvailableInTheDesign() {
        Assert.assertEquals(pageTitle,"Kashier | Sign Up");
        driver.quit();
    }

    @When("applicant checks full name's placeholder value")
    public void applicantChecksFullNameSPlaceholderValue() {
        fullNameField = driver.findElement(By.name("full_name"));
    }

    @Then("Value is as described")
    public void valueIsAsDescribed() {
        Assert.assertEquals(fullNameField.getAttribute("placeholder"), "Enter full name");
        driver.quit();
    }
}
