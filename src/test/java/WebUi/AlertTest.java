package WebUi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/5.
 */
public class AlertTest {
    WebDriver driver;
    /*
    * switchto转交控制权
    * 1：打开测试网页
    * 2：点击alert
    * 3：点击确定按钮
    * */
    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void AlertTest() throws InterruptedException {
        driver.get("file://C:/Users/root/Downloads/selenium_html/index.html");
        driver.findElement(By.xpath(".//*[@id='alert']/input")).click();
        Thread.sleep(3000);
//        把控制权转交给alert
        Alert alert = driver .switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

    }
    @AfterMethod
    public void closeChrome(){
        driver.close();
    }
}
