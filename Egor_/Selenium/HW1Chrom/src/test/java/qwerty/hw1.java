package qwerty;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Egor on 16.10.2016.
 */
public class hw1 {

    static WebDriver driver;

    @BeforeClass
    public static void beforeAllTests()
    {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
    }

    @AfterClass
    public static void afterAllTests()
    {
        driver.close();
    }

    @After
    public void afterEachTest ()
    {
        driver.findElement(By.id("lst-ib")).clear();
    }

    @Test
    public void usingID()
    {
        String text = "usingID";
        WebElement googleEdit = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));// driver.findElement(By.id("gs_taif0"));
        googleEdit.sendKeys(text+"\n");
        (new WebDriverWait(driver,5)).until(ExpectedConditions.titleContains(text));
        Assert.assertTrue(String.format("the title %1s does not contain the text %2s",driver.getTitle(),text),driver.getTitle().contains(text));
    }

    @Test
    public void usingCCS()
    {
        String text = "usingCCS";
        WebElement googleEdit = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='q']")));
        googleEdit.sendKeys(text+"\n");
        (new WebDriverWait(driver,5)).until(ExpectedConditions.titleContains(text));
        Assert.assertTrue(String.format("the title %1s does not contain the text %2s",driver.getTitle(),text),driver.getTitle().contains(text));
    }

    @Test
    public void usingXpath()
    {
        String text = "usingXpath";
        WebElement googleEdit = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lst-ib']")));
        googleEdit.sendKeys(text+"\n");
        (new WebDriverWait(driver,5)).until(ExpectedConditions.titleContains(text));
        Assert.assertTrue(String.format("the title %1s does not contain the text %2s",driver.getTitle(),text),driver.getTitle().contains(text));
    }
}

