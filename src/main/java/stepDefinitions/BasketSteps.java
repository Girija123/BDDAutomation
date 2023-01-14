package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.BasketPage;

public class BasketSteps extends CommonFunctions {

    BasketPage basketPage = new BasketPage(driver);

    @When("I choose product {string} with cart updated {string}")
    public void chooseProduct(String productName, String expectedBagQty)
    {
        driver.findElement(By.xpath("//div[text()='"+productName+"']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/button[text()='Add to cart']")).click();
        String actualBagQty = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(expectedBagQty, actualBagQty);
    }

    @When("I click bag icon and page heading as {string}")
    public void clickBagIcon(String expectedPageHeading)
    {
        basketPage.clickCartIcon();
        String actualPageHeadingText = driver.findElement(By.cssSelector(".title")).getText();
        Assert.assertEquals(expectedPageHeading, actualPageHeadingText);
    }

    @Then("I should see product {string} in bag")
    public void verifyProductInBag(String expectedProductInBag)
    {
        String actualProductInBag = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertEquals(expectedProductInBag, actualProductInBag);
    }
}
