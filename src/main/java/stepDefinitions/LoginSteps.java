package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

public class LoginSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on Home Page {string} with title {string}")
    public void openHomePage(String url, String expectedPageTitle)
    {
        driver.get(url);
        Assert.assertEquals(expectedPageTitle, driver.getTitle());
    }

    @When("I enter username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password)
    {
        loginPage.typeUsername(username);
        loginPage.typePassword(password);
    }

    @When("I click login button")
    public void clickLoginButton()
    {
        loginPage.clickLoginBtn();
    }

    @Then("I should get re-directed to list of products page with heading text {string}")
    public void verifyValidLogin(String expectedProductHeadingText)
    {
        String actualProductHeadingText = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(expectedProductHeadingText, actualProductHeadingText);
    }

    @Then("I should get an error message {string}")
    public void verifyInValidLogin(String expectedErrorMessage)
    {
        String actualErrorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
