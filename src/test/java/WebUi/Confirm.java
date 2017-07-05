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
public class Confirm {
    WebDriver driver;
    /*
    * 1:打开测试页面
    * 2：点击confirm按钮
    * 3：点击取消
    * 4：再次点击确定
    * */
    @BeforeMethod
    public void openChromeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void confirmTest(){
        driver.get("file:///D:/selenium_html/index.html");
        driver.findElement(By.className("confirm")).click();
        Alert alert = driver.switchTo().alert();
//        点击取消
        alert.dismiss();
//        点击确定
        alert.accept();
    }
    @AfterMethod
    public void colsed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
