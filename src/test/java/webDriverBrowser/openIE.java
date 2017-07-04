package webDriverBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by root on 2017/7/3.
 */
public class openIE {
    @Test
    public void openIETest(){
        System.setProperty("webrive.ie.driver","C:\\Users\\root\\IdeaProjects\\ReviewTest1\\drives\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
    }
}
