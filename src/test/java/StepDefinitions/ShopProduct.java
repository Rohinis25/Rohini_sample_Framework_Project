package StepDefinitions;

import Pages.MyShop;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ShopProduct extends MyShop{

    @Then("Click on Shop Menu")
    public void clickOnShopMenu() throws InterruptedException
    {
        /*WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofMinutes(20));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Shop']")));
        driver.findElement(By.xpath("//*[text()='Shop']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[text()='Shop']")).click();
        //Thread.sleep(3000);
       // */
        clickShopMenu();
    }

    @Then("verify user is in  the shop page or not")
    public void verifyUserIsInTheShopPageOrNot() {
        WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofMinutes(40));
        WebElement e= driver.findElement(By.xpath("//h4[text()='Filter by price']"));
        boolean isLabeldisplayedOrNot=e.isDisplayed();
        //Assert.assertTrue("Label is not diplayed",isLabeldisplayedOrNot);
        Assert.assertEquals("label are not matching","FILTER BY PRICE",e.getText());
    }


    @Then("Select javascript from product categories")
    public void selectJavascriptFromProductCategories() throws InterruptedException {
        WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofMinutes(20));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='JavaScript']")));
        //driver.findElement(By.xpath("//a[text()='JavaScript']")).click();
        javascriptByProductCategories();
        Thread.sleep(2000);
        //driver.close();
    }

    @Then("clicks on default sorting")
    public void clicksOnDefaultSorting() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.switchTo().defaultContent();
       // driver.findElement(By.xpath("//form[@class='woocommerce-ordering']")).click();
        sortByDefault();
        Thread.sleep(2000);

    }

    @Then("user selects sort by  popularity")
    public void userSelectsSortByPopularity() {
        //driver.findElement(By.xpath("//option[text()='Sort by popularity']")).click();
        sortByPopularity();
    }


    @Then("user click one book from sort by popularity")
    public void userClickOneBookFromSortByPopularity() {
        driver.findElement(By.xpath("//a[@href=\"https://practice.automationtesting.in/product/mastering-javascript/\"]")).click();
        //WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofMinutes(20));
        //driver.close();
    }


    @Then("user adding one book to basket")
    public void userAddingOneBookToBasket() {
      JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,300)", "");
        //WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofMinutes(30));
        //explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()=\"Add to basket\']")));
        //driver.findElement(By.xpath("//a[text()=\"Add to basket\"]")).click();
       //driver.findElement(By.xpath("//form//button[text()=\"Add to basket\"]")).click();
       clickAddToBasket();
        //driver.findElement(By.xpath("//a[@href=\"/shop/?orderby=popularity&add-to-cart=165\"]")).click();

    }

    @Then("user click view basket")
    public void userClickViewBasket() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        clickViewBasket();
        //driver.findElement(By.xpath("//a[text()='View Basket']")).click();

    }


    @Then("user adding book to basket")
    public void userAddingBookToBasket() {

        WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofMinutes(20));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href=\"/product-category/javascript/?add-to-cart=165\"]")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        AddingBookToBasket();
        //driver.findElement(By.xpath("//a[@href=\"/product-category/javascript/?add-to-cart=165\"]")).click();

    }

    @Then("close the browser")
    public void closeTheBrowser() {
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\v103748\\Downloads\\chromedriver.exe");
        close();
    }

    @Then("take a screenshot of view basket")
    public void takeAScreenshotOfViewBasket() throws IOException, InterruptedException {
        Thread.sleep(1000);
        takeScreenshot("Add_to_basketScreenshot");
        Thread.sleep(2000);
    }

    @Then("click Read more Functionality of a book")
    public void clickReadMoreFunctionalityOfABook() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        //driver.findElement(By.xpath("//a[text()='Read more'][1]")).click();
        clickReadMore();

    }

    @Then("it should display only Javascript products")
    public void itShouldDisplayOnlyJavascriptProducts()
    {
        List<WebElement> productList= driver.findElements(By.xpath("//ul[contains(@class,'products')]/li"));
        int productCount= productList.size();
        System.out.println("Product count:"+ productCount);
        Assert.assertEquals("Count is not matching",3,productCount);
        List<WebElement> productList2= driver.findElements(By.xpath("//ul[contains(@class,'products')]//a//h3"));
        for(WebElement product:productList2)
        {
            System.out.println(product.getText());
            Assert.assertTrue("Javascript is not present",product.getText().contains("JS")||product.getText().contains("JavaScript"));
        }
    }
}
