package webDriverBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/3.
 */
public class openChrome {
    WebDriver driver;
    @Test
    public void openChromeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
    }
    @Test
    public void clickTest(){
        System.setProperty("webdriver.firefox.bin","D:\\program files\\Mozilla Firefox\\firefox.exe");
//        启动firefox浏览器
        driver = new FirefoxDriver();
        driver.get("http://www.dianzan.it");
        driver.findElement(By.linkText("社区专题")).click();
    }
}
