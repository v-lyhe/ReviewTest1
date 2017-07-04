package webDriverBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/3.
 */
public class opebFireFox {
    WebDriver driver;

    @Test
    public void openFirefox(){
//        指定安装路径
        System.setProperty("webdriver.firefox.bin","D:\\program files\\Mozilla Firefox\\firefox.exe");
//        启动firefox浏览器
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }
}
