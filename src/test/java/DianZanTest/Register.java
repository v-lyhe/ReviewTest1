package DianZanTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/4.
 */
public class Register {
    WebDriver driver;
    @BeforeTest
    public void openChromeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void register() {
        driver.get("http://www.dianzan.it");
        driver.findElement(By.xpath("html/body/section/div[3]/div[1]/div[1]/div[1]/a[2]")).click();
        driver.findElement(By.id("registermobile")).sendKeys("18217185096");
        driver.findElement(By.id("vcode")).sendKeys("123456");
        driver.findElement(By.linkText("点击获取")).click();




    }

    @AfterMethod
    public void closeChrome(){
        driver.close();

    }
}
