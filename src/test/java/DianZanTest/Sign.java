package DianZanTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/4.
 */
public class Sign {
    WebDriver driver;
    @BeforeTest
    public void openChromeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void Sign() throws InterruptedException {
        driver.get("http://www.dianzan.it");
        driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("mobile")).sendKeys("18217185096");
        driver.findElement(By.id("password")).sendKeys("258963");
        Thread.sleep(3000);



    }

    @AfterMethod
    public void closeChrome() {
        driver.close();
    }
}
