package WebUi;


import org.apache.bcel.generic.DREM;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by root on 2017/7/5.
 */
public class clearSnedkeys {
    WebDriver driver;
    /*
    * 打开点赞
    * 在搜索框输入“点赞，让态度有价值”
    * 清空输入框
    * 在搜索框输入“点赞的态度”
    * 点击搜索
    * 校验搜索内容
    * 关闭浏览器
    *
    * */

    @BeforeMethod
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public void clear() throws InterruptedException {
        driver.get("http://www.dianzan.it");
        WebElement input = driver.findElement(By.id("globalSearchName"));
        input.sendKeys("点赞，让态度有价值");
        Thread.sleep(3000);
        input.clear();
        Thread.sleep(3000);
        input.sendKeys("点赞的态度");
        WebElement btn = driver.findElement(By.id("categoryname_7"));
        Thread.sleep(3000);
        Assert.assertEquals(btn,"全民");
        Thread.sleep(3000);
    }
    /*
    * 截图点赞首页
    * */
    @Test
    public void jietu(){
        driver.get("http://www.dianzan.it");
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("d:\\test1.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closeChrome() {
        driver.close();

    }
}
