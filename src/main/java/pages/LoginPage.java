package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="input[placeholder='Username']")
    public WebElement usernameTxtFld;

    @FindBy(name="password")
    public WebElement passwordTxtFld;

    @FindBy(id="login-button")
    public WebElement loginBtn;

    public void typeUsername(String username)
    {
        usernameTxtFld.sendKeys(username);
    }

    public void typePassword(String password)
    {
        passwordTxtFld.sendKeys(password);
    }

    public void clickLoginBtn()
    {
        loginBtn.click();
    }


}
