package Pages;

import Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sun.awt.windows.ThemeReader;

public class NaviExtensions {
    public static void marketplace() {
        Browser.driver.findElement(By.id("menu-extension")).click();
        Browser.driver.findElement(By.xpath("//li[@id=\"menu-extension\"]//li[1]")).click();
    }

    public static void extensionList(String searchExtension) throws InterruptedException {
        Thread.sleep(5000);
        Browser.driver.findElement(By.xpath("//div[@id=\"extension-filter\"]//input[@class=\"form-control\"]")).sendKeys(searchExtension);
        Thread.sleep(5000);
        Browser.driver.findElement(By.xpath("//button[@id=\"button-filter\"]")).click();
        Thread.sleep(5000);
//        WebElement element = Browser.driver.findElement(By.xpath("//img[@alt=\"Social Like FREE (Google+, LinkedIn)\"]"));
//        element.getText();
//       Assert.assertEquals(element,"Social Like FREE (Google+, LinkedIn)");
    }
}
