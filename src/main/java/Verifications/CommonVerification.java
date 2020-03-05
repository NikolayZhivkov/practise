package Verifications;

import Browser.Browser;
import org.testng.Assert;

public class CommonVerification {
    public static void verifyTitle(String expectedTitle, String errorMessage) {
        String dashboardtitle = Browser.driver.getTitle();
        Assert.assertEquals(dashboardtitle,expectedTitle,errorMessage);
    }
}
