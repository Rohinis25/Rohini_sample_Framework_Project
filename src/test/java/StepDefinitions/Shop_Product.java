package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class Shop_Product {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Shop']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//span[text()='Close']")).click();
        //driver.findElement(By.xpath("//div[contains(@id,'dismiss-button')]")).click();
        WebElement frame1= driver.findElement(By.id("aswift_13"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='JavaScript']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Add to basket']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='View Basket']")).click();
        //Select quantity = new Select(driver.findElement(By.xpath("//input[contains(@value,'2')")));
        //quantity.deselectByIndex(3);
        //WebElement l=driver.findElement(By.cssSelector("//div//input[value*=value]"));
       // l.sendKeys("2");
        // obtain the value entered with getAttribute method
        //System.out.println("Value entered is: " +l.getAttribute("value"));
        //driver.findElement(By.xpath("//div//input[@value='1']")).click();
        Thread.sleep(2000);
        driver.close();

        driver.quit();

    }
}
