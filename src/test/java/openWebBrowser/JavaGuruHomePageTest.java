package openWebBrowser;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.concurrent.TimeUnit;


public class JavaGuruHomePageTest
{
    private String HOME_PAGE = "http://www.google.com";
    @Test
    public void openBrowser()
    {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(HOME_PAGE);
        WebElement input = driver.findElement(By.id("lst-ib"));
        input.click();
        input.sendKeys("I love Java");
        input.sendKeys(Keys.ENTER);
        input.click();
        input.sendKeys(Keys.CLEAR);


    }
}
