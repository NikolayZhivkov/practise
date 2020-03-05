package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    public static void open(String browserType) {

        switch (browserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikolay\\IdeaProjects\\PracticeJavaSeleniumPageObjectModelBDD\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikolay\\IdeaProjects\\PracticeJavaSeleniumPageObjectModelBDD\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            default:
                throw new RuntimeException("The browser" + browserType + "is not on the list!");
        }
    }

    public static void quit() {
        driver.quit();
    }
}
