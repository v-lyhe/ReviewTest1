package WebUi;

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
public class ActionsTest {
    WebDriver driver;
    /*
    * 点击点赞首页的全部按钮
    *
    * */
    @BeforeMethod
    public void openChromeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void Clickquanbu() throws InterruptedException {
        driver.get("http://www.dianzan.it");
        driver.findElement(By.id("toPage_0")).click();

        Thread.sleep(3000);
//        获取当前页面url
        String url =  driver.getCurrentUrl();
//        校验url是否一致
        Assert.assertEquals(url,"http://www.dianzan.it/discover/activity.act");


    }
    @AfterMethod
    public void colsed(){
        driver.quit();
    }
}
