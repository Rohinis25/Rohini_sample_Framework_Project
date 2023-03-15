package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class Account {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='My StepDefinitions.Account']")).click();
        Thread.sleep(3000);
        WebElement frame1= driver.findElement(By.id("aswift_13"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        boolean isLabelPresent=driver.findElement(By.xpath("//h2[text()='Login' or text()='Register']")).isDisplayed();

        WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofMinutes(20));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Login' or text()='Register']")));

        Assert.assertTrue("User can't login from this page",isLabelPresent);
       // driver.findElement(By.id("reg_email")).sendKeys("vichu55vs@gmail.com");
        //driver.findElement(By.id("reg_password")).sendKeys("Selenium&25?");
        //driver.findElement(By.name("register")).click();
        driver.findElement(By.id("username")).sendKeys("vichu55vs@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Selenium&25?");
        driver.findElement(By.id("rememberme")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//a[text()='Addresses']")).click();
        driver.findElement(By.xpath("//a[@href=\"https://practice.automationtesting.in/my-account/edit-address/billing\"]")).click();
        driver.findElement(By.id("billing_first_name")).sendKeys("Rohini");
        driver.findElement(By.id("billing_last_name")).sendKeys("s");
        //driver.findElement(By.id("billing_email")).sendKeys("rohini_s@ymail.com");
        driver.findElement(By.id("billing_phone")).sendKeys("9999999999");
        //driver.findElement(By.id("billing_country")).sendKeys("India");
        driver.findElement(By.id("billing_address_1")).sendKeys("12 riverview st");
        driver.findElement(By.id("billing_address_2")).sendKeys("unit 25");
        driver.findElement(By.id("billing_city")).sendKeys("Trivandrum");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).click();
        //driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']")).sendKeys("Kerala");
       /*WebElement stateName= driver.findElement(By.id("billing_state"));
        Select drpState = new Select(stateName);
        String option="KL";
        drpState.selectByValue(option)*/;


        //driver.findElement(By.id("billing_state_field")).sendKeys("Kerala");
        driver.findElement(By.id("billing_postcode")).sendKeys("09854");
        //driver.findElement(By.name("save_address")).click();
         driver.findElement(By.xpath("//input[@name=\"save_address\"]")).click();
         Thread.sleep(2000);

       driver.findElement(By.xpath("//a[text()='Logout']")).click();


        Thread.sleep(2000);

    }

}
