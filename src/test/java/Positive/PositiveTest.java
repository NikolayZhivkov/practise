package Positive;

import Browser.Browser;
import Pages.AdminLogIn;
import Pages.Catalogs;
import Pages.NaviExtensions;
import Pages.Sales;
import Verifications.CommonVerification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveTest {

    @BeforeMethod
public void setUp(){
        Browser.open("chrome");
    }
    @AfterMethod
    public void tearDown(){
        Browser.quit();

    }

    @Test
    public void adminLogInTest() throws InterruptedException {
        AdminLogIn.goTo();
        AdminLogIn.LogIn("admin","parola123!");
        CommonVerification.verifyTitle("Dashboard","You are not on the right page!");

        Catalogs.products();
        Catalogs.filters();
        NaviExtensions.marketplace();
        CommonVerification.verifyTitle("Extension Marketplace","Opps wrong page!");
        NaviExtensions.extensionList(" Social Like FREE (Google+, LinkedIn)");
        Sales.ordersStatus();



    }

}
