package Pages;

import Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sales {
    public static void ordersStatus() {
        Browser.driver.findElement(By.id("menu-sale")).click();
        Browser.driver.findElement(By.xpath("//li[@id=\"menu-sale\"]//li[1]")).click();
        String title = Browser.driver.getTitle();
        Assert.assertEquals(title, "Orders", "Opps something is wrong!!!");

        WebElement status = Browser.driver.findElement(By.id("input-order-status"));
        Select orderSTA= new Select(status);


        List<String> exp_options = Arrays.asList(new String[]{"", "Missing Orders", "Canceled", "Canceled Reversal", "Chargeback", "Complete", "Denied", "Expired", "Failed", "Pending", "Processed", "Processing", "Refunded", "Reversed", "Shipped", "Voided"});
        List<String> act_options = new ArrayList<>();
        List<WebElement> options = orderSTA.getOptions();

        for (WebElement option: options) {
act_options.add(option.getText());

        }
Assert.assertEquals(exp_options.toArray(),act_options.toArray());
    }
}
