package WebUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/3.
 */
public class click {

    WebDriver driver;
    @Test
    public void clickTest(){
        System.setProperty("webdriver.firefox.bin","D:\\program files\\Mozilla Firefox\\firefox.exe");
//        启动firefox浏览器
        driver = new FirefoxDriver();
        driver.get("http://www.dianzan.it");
        WebElement element = driver.findElement(By.id("toPage_0"));
    }
}
