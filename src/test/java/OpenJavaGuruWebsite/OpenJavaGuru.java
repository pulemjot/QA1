package OpenJavaGuruWebsite;


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


public class OpenJavaGuru
{
    private String HOME_PAGE = "http://javaguru.lv/";
    private static final By button =  By.xpath(".//span[text()='Курс Тестирования(QA)']");
    @Test
    public void openBrowser()
    {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(HOME_PAGE);
        WebElement input = driver.findElement(button);
        Assert.assertFalse("Element not visible", input.isDisplayed());
        input.click();


    }
}
