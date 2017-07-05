package WebUi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/5.
 */
public class prompt {
    WebDriver driver;
    /*
    * 1:打开测试页面
    * 2：点击prompt
    * 3:输入：“这是真的”
    * 4：点击确定
    * 5：再次点击确定
    * */
    @BeforeMethod
    public void openChromeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void prompt(){
        driver.get("file://C:/Users/root/Downloads/selenium_html/index.html");
        driver.findElement(By.className("prompt")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("这是假的");
        alert.dismiss();
        alert.accept();




    }
    @AfterMethod
    public void colsed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
