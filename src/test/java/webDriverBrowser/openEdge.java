package webDriverBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/3.
 */
public class openEdge {
    @Test
    public void openEdgeTest(){

        System.setProperty("webdriver.edge.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
    }

}
