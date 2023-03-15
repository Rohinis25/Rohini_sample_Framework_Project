package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyShop extends CommonMethods {
    public void productCategories(){}
    public void defaultSorting(){}
    public void readMore(){}
    public void AddToBasket(){}
    public void viewBasket(){}
    public void clickShopMenu() throws InterruptedException
    {
        WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofMinutes(20));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Shop']")));
        //driver.findElement(By.xpath("//*[text()='Shop']")).click();
        clickAnElement("//*[text()='Shop']","xpath");
        Thread.sleep(1000);
        closeAd();
        /*driver.switchTo().frame("aswift_7");
        driver.switchTo().frame("ad_iframe");
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();*/

    }
    public void javascriptByProductCategories()
    {
        clickAnElement("//a[text()='JavaScript']","xpath");

    }
    public void HTMLByProductCategories()
    {
        clickAnElement("//a[text()='HTML']","xpath");

    }
    public void androidByProductCategories()
    {
        clickAnElement("//a[text()='Android']","xpath");

    }
    public void seleniumByProductCategories()
    {
        clickAnElement("//a[text()='Selenium']","xpath");

    }
    public void viewSortingCategories()
    {
        clickAnElement("//form[@class='woocommerce-ordering']","xpath");
    }
    public void sortByDefault()
    {
       // driver.findElement(By.xpath("//form[@class='woocommerce-ordering']")).click();
        clickAnElement("//form[@class='woocommerce-ordering']","xpath");
    }
    public void sortByPopularity()
    {
        //driver.findElement(By.xpath("//option[text()='Sort by popularity']")).click();
        clickAnElement("//option[text()='Sort by popularity']","xpath");
    }
    public void sortByAverageRating()
    {
        clickAnElement("//option[text()='Sort by average rating']","xpath");
    }
    public void sortByNewness()
    {
        clickAnElement("//option[text()='Sort by newness']","xpath");
    }
    public void sortByPriceLowToHigh()
    {
        clickAnElement("//option[text()='Sort by price: low to high']","xpath");
    }
    public void sortByPriceHighToLow()
    {
        clickAnElement("//option[text()='Sort by price: high to low']","xpath");
    }
    public void clickReadMore()
    {
        //driver.findElement(By.xpath("//a[text()='Read more'][1]")).click();
        clickAnElement("//a[text()='Read more'][1]","xpath");
    }
    public void AddingBookToBasket()
    {
        //driver.findElement(By.xpath("//a[@href=\"/product-category/javascript/?add-to-cart=165\"]")).click();
        clickAnElement("//a[@href=\"/product-category/javascript/?add-to-cart=165\"]","xpath");
    }
    public void clickAddToBasket()
    {
         //driver.findElement(By.xpath("//form//button[text()=\"Add to basket\"]")).click();
        clickAnElement("//form//button[text()=\"Add to basket\"]","xpath");
    }
    public void clickViewBasket()
    {
       // driver.findElement(By.xpath("//a[text()='View Basket']")).click();
        clickAnElement("//a[text()='View Basket']","xpath");
    }



}
