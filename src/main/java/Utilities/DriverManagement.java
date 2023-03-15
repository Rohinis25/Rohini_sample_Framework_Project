package Utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManagement
{
    private static WebDriver driver =null;
    public static WebDriver getDriver()
    {
        if(driver==null)
        {
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

        }
        return driver;
    }
    @After
    public  void tearDown()
    {
        driver.quit();
        driver=null;
    }
    @Before
    public void startUp()
    {
        System.out.println("About the start the test execution");
    }
}
