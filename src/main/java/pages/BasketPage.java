package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public BasketPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="shopping_cart_link")
    public WebElement cartIcon;

    public void clickCartIcon()
    {
        cartIcon.click();
    }
}
