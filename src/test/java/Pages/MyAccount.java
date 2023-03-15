package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MyAccount extends CommonMethods {
    public void login()
    {
        enterUserName("rohini_s@ymail.com");
        enterPassword("Selenium&25??");
        clickLogin();
    }
    public void register()
    {
        enterEmailAddress("abc@gmail.com");
        enterPasswordForRegister("123");
        clickRegister();
    }
    public void lostPassword(){}
    public void clickAccountMenu() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
        clickAnElement("//*[text()='My Account']","xpath");
        Thread.sleep(2000);
        /*driver.switchTo().frame("aswift_8");
        driver.switchTo().frame("ad_iframe");
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();*/
       closeAd();
    }
    public void enterUserName(String userName)
    {
        //driver.findElement(By.id("username")).sendKeys(userName);
        setText("username","id",userName);
    }
    public void enterPassword(String password)
    {
        //driver.findElement(By.id("password")).sendKeys(password);
        setText("password","id",password);
    }
    public void clickLogin()
    {
       // driver.findElement(By.name("login")).click();
        clickAnElement("login","name");
    }
    public void enterEmailAddress(String emailAddress)
    {
       // driver.findElement(By.id("reg_email")).sendKeys(emailAddress);
        setText("reg_email","id",emailAddress);
    }
    public void enterPasswordForRegister(String password)
    {
        //driver.findElement(By.id("reg_password")).sendKeys(password);
        setText("reg_password","id",password);
    }
    public void clickRegister()
    {
        //driver.findElement(By.name("register")).click();
        clickAnElement("register","name");
    }



}
