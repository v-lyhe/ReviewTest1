package DianZanTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/4.
 */
public class HomeC {
    WebDriver driver;
    @BeforeTest
    public void openChromeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void homeclick(){
        driver.get("http://www.dianzan.it");
        driver.findElement(By.id("toPage_0")).click();
        driver.findElement(By.id("toPage_1")).click();
        driver.findElement(By.id("toPage_2")).click();
        driver.findElement(By.id("toPage_3")).click();
        driver.findElement(By.id("toPage_4")).click();
        driver.findElement(By.id("toPage_5")).click();
        driver.findElement(By.id("toPage_6")).click();
        driver.findElement(By.id("toPage_7")).click();
        driver.findElement(By.id("toPage_8")).click();
        driver.findElement(By.id("toPage_9")).click();
        driver.findElement(By.id("toPage_10")).click();
        driver.findElement(By.id("toPage_11")).click();


    }
    @AfterMethod
    public void closeChrome() {
        driver.close();
    }
}
