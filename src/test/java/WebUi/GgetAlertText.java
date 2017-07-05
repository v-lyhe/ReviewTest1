package WebUi;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/5.
 */
public class GgetAlertText {
    WebDriver driver;
    @BeforeMethod
    public void openChromeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void getAlertText(){
        driver.get("file://C:/Users/root/Downloads/selenium_html/index.html");
        driver.findElement(By.className("alert")).click();
        Alert alert = driver.switchTo().alert();
//        获取弹窗文本并赋值给text
        String text = alert.getText();
//        校验获取的文本是否正确
        Assert.assertEquals(text,"请点击确定");
    }
    @AfterMethod
    public void closeChrome() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
