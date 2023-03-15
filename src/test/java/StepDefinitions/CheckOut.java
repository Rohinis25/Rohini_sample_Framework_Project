package StepDefinitions;

import Pages.MyAccount;
import Pages.MyCheckout;
import Pages.MyShop;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.devtools.DevToolsException;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CheckOut extends MyCheckout {
    MyAccount c1=new MyAccount();
    MyShop c2=new MyShop();


    @Then("User click on  the Shop Menu")
    public void userClickOnTheShopMenu() throws InterruptedException {

       /* WebElement frame1= driver.findElement(By.xpath("//iframe[@id='aswift_14' or @id='aswift_13']"));
        //WebElement frame1= driver.findElement(By.id("aswift_13"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();*/
        //Thread.sleep(2000);
        c2.clickShopMenu();
    }

    @Then("Select Javascript from product categories")
    public void selectJavascriptFromProductCategories() {
        //driver.findElement(By.xpath("//a[text()='JavaScript']")).click();
        //Thread.sleep(2000);
        c2.javascriptByProductCategories();
    }

    @Then("User adding book to the basket")
    public void userAddingBookToTheBasket() {
        //driver.findElement(By.xpath("//a[text()='Add to basket']")).click();
        //clickAnElement("//a[text()='Add to basket']","xpath");
        c2.AddingBookToBasket();
    }

    @Then("User click view basket to see selected items")
    public void userClickViewBasketToSeeSelectedItems() {
        //WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofMinutes(20));
        //explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='View Basket']")));
        //driver.findElement(By.xpath("//a[text()='View Basket']")).click();
        c2.clickViewBasket();
    }

    @Then("User proceed to checkout")
    public void userProceedToCheckout()
    {
        proceedCheckout();

    }

    @Then("login to user account")
    public void loginToUserAccount() {
        driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
        c1.login();
    }

    @Then("filling billing details")
    public void fillingBillingDetails() {

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,250)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
        billDetailsFilling();
    }
    @Then("place order")
    public void placeOrder() throws InterruptedException {

       // driver.findElement(By.xpath("//input[@id=\"place_order\"]")).click();
       clickPlaceOrder();
    }

    @Then("user provides Email Address in login form")
    public void userProvidesEmailAddressInLoginForm() {
        driver.findElement(By.id("username")).sendKeys("rohini_s@ymail.com");
    }

    @And("password for login")
    public void passwordForLogin() {
        driver.findElement(By.id("password")).sendKeys("Selenium&25??");
    }

    @Then("User clicks login button")
    public void userClicksLoginButton() {
        driver.findElement(By.name("login")).click();
    }

    @Then("Click On My Account Menu")
    public void clickOnMyAccountMenu() {
        driver.findElement(By.xpath("//*[text()='My Account']")).click();
    }

    @Then("user takes a screenshot of placeorder")
    public void userTakesAScreenshotOfPlaceorder() throws IOException, InterruptedException {
        Thread.sleep(1000);
        takeScreenshot("Order-confirmation_Screenshot");
        Thread.sleep(2000);
    }

    @Then("close the button")
    public void closeTheButton() {
        close();
    }

    @Then("login into account again")
    public void loginIntoAccountAgain() throws InterruptedException {

        c1.clickAccountMenu();
        c1.login();

    }

    @Then("click on order menu")
    public void clickOnOrderMenu() throws InterruptedException {
        //driver.findElement(By.xpath("//a[@href=\"https://practice.automationtesting.in/my-account/orders/\"]")).click();
        clickOrderMenu();
        Thread.sleep(1000);
    }

    @Then("user takes a screenshot of orders from account")
    public void userTakesAScreenshotOfOrdersFromAccount() throws IOException, InterruptedException {
        Thread.sleep(1000);
        takeScreenshot("AllOrders_Screenshot");
        Thread.sleep(2000);

    }

    @Then("user leaves one mandatory field blank")
    public void userLeavesOneMandatoryFieldBlank() {
        //driver.findElement(By.xpath("//input[@id=\"billing_address_1\"]")).clear();
        clearField("//input[@id=\"billing_address_1\"]","xpath");
    }

    @Then("add product to basket and proceed to checkout")
    public void addProductToBasketAndProceedToCheckout() throws InterruptedException {
        shopProduct();
    }
}
