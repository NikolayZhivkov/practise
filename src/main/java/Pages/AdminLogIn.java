package Pages;

import Browser.Browser;
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminLogIn {

    private static final By LOC_USERNAME = By.id("input-username");
    private static final By LOC_PASSWORD = By.id("input-password");
    private static final By LOC_LOGIN_BUTTON_ADMINPAGE = By.xpath("//button[@class=\"btn btn-primary\"]");

    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/admin/");
    }


    public static void LogIn(String username, String password) {

        Browser.driver.findElement(LOC_USERNAME).sendKeys(username);
        Browser.driver.findElement(LOC_PASSWORD).sendKeys(password);
        Browser.driver.findElement(LOC_LOGIN_BUTTON_ADMINPAGE).click();

    }
}
