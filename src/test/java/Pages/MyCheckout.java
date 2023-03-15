package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class MyCheckout extends CommonMethods
{   MyShop c2=new MyShop();
    public void billDetailsFilling()
    {
        billingFirstName("Rohini");
        billingLastName("ss");
        billingEmail("rohini_s@ymail.com");
        billingPhone("9087789999");
        billingAddress("47 Apple st");
        billingAddressApt("Apt 26");
        billingCity("Delhi");
        changeState();
        billingPostcode("08976");
    }
    public void shopProduct() throws InterruptedException {
        c2.clickShopMenu();
        c2.javascriptByProductCategories();
        c2.AddingBookToBasket();
        c2.clickViewBasket();
        proceedCheckout();
    }
    public void proceedCheckout()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//a[@href=\"https://practice.automationtesting.in/checkout/\"]")).click();
    }
    public void billingFirstName(String billingFirstName)
    {
        clearField("//input[@id=\"billing_first_name\"]","xpath");
        setText("//input[@id=\"billing_first_name\"]","xpath",billingFirstName);
    }
    public void billingLastName(String billingLastName)
    {
        clearField("//input[@id=\"billing_last_name\"]","xpath");
        setText("//input[@id=\"billing_last_name\"]","xpath",billingLastName);
    }

    public void billingEmail(String billingEmail)
    {
        clearField("//input[@id=\"billing_email\"]","xpath");
        setText("//input[@id=\"billing_email\"]","xpath",billingEmail);
    }
    public void billingPhone(String billingPhone)
    {
        clearField("//input[@id=\"billing_phone\"]","xpath");
        setText("//input[@id=\"billing_phone\"]","xpath",billingPhone);
    }
    public void billingAddress(String billingAddress)
    {
        clearField("//input[@id=\"billing_address_1\"]","xpath");
        setText("//input[@id=\"billing_address_1\"]","xpath",billingAddress);
    }
    public void billingAddressApt(String billingAddressApt)
    {
        clearField("//input[@id=\"billing_address_2\"]","xpath");
        setText("//input[@id=\"billing_address_2\"]","xpath",billingAddressApt);
    }
    public void billingCity(String billingCity)
    {
        clearField("//input[@id=\"billing_city\"]","xpath");
        setText("//input[@id=\"billing_city\"]","xpath",billingCity);
    }
    public void billingPostcode(String billingPostcode)
    {
        clearField("//input[@id=\"billing_postcode\"]","xpath");
        setText("//input[@id=\"billing_postcode\"]","xpath",billingPostcode);
    }
    public void clickPlaceOrder() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");
        clickAnElement("//input[@id=\"place_order\"]","xpath");
        Thread.sleep(2000);
    }
    public void clickOrderMenu()
    {
        clickAnElement("//a[@href=\"https://practice.automationtesting.in/my-account/orders/\"]","xpath");
    }
    public void changeState()
    {
       clickAnElement("//div[@id=\"s2id_billing_state\"]","xpath");
       driver.findElement(By.xpath("//div//input[@id=\"s2id_autogen2_search\"]")).sendKeys("");
       List<WebElement> listOfElements=driver.findElements(By.xpath(".//*[@role='listbox']/li"));
       for(WebElement state : listOfElements){
           if(state.getText().equals("Punjab"))
           {
               state.click();
               break;
           }
       }
       //clickAnElement("//ul//li//option[text()='Punjab']","xpath");
    }
}
