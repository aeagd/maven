package sougouTest;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.*;

public class SeleniumTest {
    public static WebDriver driver = null;
    public static String url="https://www.sogou.com";

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.ie.driver","D:/Tools/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get(url);
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

    @Test
    public void TestTitle(){
        Assert.assertEquals("搜狗搜索引擎",driver.getTitle());
        WebElement element = driver.findElement(By.id("query"));
        element.sendKeys("junit");
        element.submit();
    }

    @Test
    public void TestXpath(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"query\"]"));
        element.sendKeys("junit");
        element.submit();
    }
}