package WebUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/5.
 */
public class Sendkeys {
    WebDriver driver;
    /*
    * 打开点赞
    * 在搜索框输入“点”
    * 点击搜索
    * 校验第一个搜索结果是否是“一次改变，点亮心愿”公益活动”
    * */

    @BeforeMethod
    public void openChrom() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void sendkeys() throws InterruptedException {
        driver.get("http://www.dianzan.it");
       WebElement keys = driver.findElement(By.id("globalSearchName"));
       keys.sendKeys("点");
       Thread.sleep(3000);
       WebElement btn = driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/a"));
       btn.click();
       Thread.sleep(3000);
       WebElement text = driver.findElement(By.id("toPage_0"));
        Assert.assertEquals(text,"点");
        Thread.sleep(3000);
//        获取title
        String title = driver.getTitle();
        Assert.assertEquals(title,"点赞网");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
