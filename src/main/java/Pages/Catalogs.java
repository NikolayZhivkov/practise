package Pages;

import Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Catalogs {
    public static void products() {
        Browser.driver.findElement(By.xpath("//li[@id=\"menu-catalog\"]")).click();
        Browser.driver.findElement(By.xpath("//li[@id=\"menu-catalog\"]//li[2]")).click();
    }

    public static void filters() throws InterruptedException {
        Browser.driver.findElement(By.id("input-name")).sendKeys("Apple Cinema 30\"");
       // Thread.sleep(5000);
        Browser.driver.findElement(By.id("input-quantity")).sendKeys("2");


        WebElement statusProducts = Browser.driver.findElement(By.id("input-status"));
        Select status = new Select(statusProducts);
        Assert.assertFalse(status.isMultiple());
        status.selectByVisibleText("Enabled");

        Browser.driver.findElement(By.id("button-filter")).click();
        Thread.sleep(5000);
        WebElement noResultText = Browser.driver.findElement(By.xpath("//td[@class=\"text-center\"]"));
        noResultText.isDisplayed();

        //Assert.assertEquals(noResultText,"No results!");
        

    }
}
