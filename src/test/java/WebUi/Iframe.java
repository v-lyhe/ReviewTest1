package WebUi;

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
public class Iframe {
    WebDriver driver;
    /*
    * 点击测试页面iframe里面的baidu按钮
    *
    * */
    @BeforeMethod
    public void openChromeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void iframeBaidu() throws InterruptedException {
        driver.get("file://C:/Users/root/Downloads/selenium_html/index.html");
//        定位到iframe
        WebElement iframe = driver.findElement(By.tagName("iframe"));
//        把控制权转交给iframe
        driver.switchTo().frame(iframe);
//        点击iframe里面的百度
        driver.findElement(By.xpath(".//*[@id='link']/a")).click();
        Thread.sleep(3000);
//        把控制权初始化
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(".//*[@id='link']/a")).click();


    }


    @AfterMethod
    public void closeChrome() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
