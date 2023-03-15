package StepDefinitions;

import Pages.MyAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class LoginAccount extends MyAccount {
    //MyAccount accountPage=new MyAccount();
    @Given("user opens the browser and navigates to {string}")
    public void userOpensTheBrowserAndNavigatesTo(String url) {
        get(url);
    }

    @Then("verify user is in  the login page or not")
    public void verifyUserIsInTheLoginPageOrNot() {
       /* boolean isLabelPresent=driver.findElement(By.xpath("//h2[text()='Login' or text()='Register']")).isDisplayed();
         Assert.assertTrue("User can't login from this page",isLabelPresent);
        System.out.println("User is entered to the login page successfully");*/
         boolean isLabelPresent=isDisplayed("//h2[text()='Login' or text()='Register']","xpath");
        WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofMinutes(20));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Login' or text()='Register']")));
        assertTrue("User can't login from this page",isLabelPresent);

    }

    @Then("user provides Email Address in Email-Address in textbox in register form {string}")
    public void userProvidesEmailAddressInEmailAddressInTextboxInRegisterForm(String email) {
        //driver.findElement(By.id("reg_email")).sendKeys("vichu50vs@gmail.com");
        enterEmailAddress(email);
    }

    @And("password {string}")
    public void password(String password) {

        //driver.findElement(By.id("reg_password")).sendKeys("Selenium&25?");
        enterPasswordForRegister(password);
    }

    @Then("user clicks Register button")
    public void userClicksRegisterButton() {
        // driver.findElement(By.name("register")).click();
        clickRegister();
    }

    @When("user clicks on Register button My Account page is loaded")
    public void userClicksOnRegisterButtonMyAccountPageIsLoaded() {
       driver.getCurrentUrl();
        System.out.println("user registered");

    }

    @Then("user clicks login button")
    public void userClicksLoginButton() {

        //driver.findElement(By.name("login")).click();
        clickLogin();
    }

    @Then("User account page is no loaded")
    public void userAccountPageIsNoLoaded() {

        WebElement e= driver.findElement(By.xpath("//a[text()='Sign out']"));
        boolean isLabeldisplayedOrNot=e.isDisplayed();
        //Assert.assertTrue("Label is not diplayed",isLabeldisplayedOrNot);
        Assert.assertEquals("label are not matching","Sign out",e.getText());
        //driver.close();
        //driver.getCurrentUrl();
        //System.out.println("You cannot login without password");
    }
    @And("valid password for login {string}")
    public void validPasswordForLogin(String password) {
        //driver.findElement(By.id("password")).sendKeys("Selenium&25??");
        enterPassword(password);

    }


    @When("user clicks on login button My Account page is loaded")
    public void userClicksOnLoginButtonMyAccountPageIsLoaded() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
        WebElement e= driver.findElement(By.xpath("//a[text()='Sign out']"));
        boolean isLabeldisplayedOrNot=e.isDisplayed();
        //Assert.assertTrue("Label is not diplayed",isLabeldisplayedOrNot);
        Assert.assertEquals("label are not matching","Sign out",e.getText());

    }


    @Then("user takes the screenshot and stores it")
    public void userTakesTheScreenshotAndStoresIt() throws IOException
    {
        takeScreenshot("Remember_me_Screenshot");
    }

    @Then("user clicks on Account Details button")
    public void userClicksOnAccountDetailsButton() {
        //driver.findElement(By.xpath("//a[text()=\"Account Details\"]")).click();
        clickAnElement("//a[text()=\"Account Details\"]","xpath");
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

    }
    @Then("user provides First name {string}")
    public void userProvidesFirstName(String firstname) {

        clearField("//input[@id=\"account_first_name\"]","xpath");
        setText("//input[@id=\"account_first_name\"]","xpath","firstname");
    }

    @And("Last name {string}")
    public void lastName(String lastname) {

        clearField("//input[@id=\"account_last_name\"]","xpath");
        setText("//input[@id=\"account_last_name\"]","xpath","lastname");
    }

    @Then("user provides current password {string}")
    public void userProvidesCurrentPassword(String password) {
        //driver.findElement(By.xpath("//input[@id=\"password_current\"]")).sendKeys("Selenium&25??");
        setText("//input[@id=\"password_current\"]","xpath",password);
    }

    @Then("user provides New password {string}")
    public void userProvidesNewPassword(String newPassword) {
        //driver.findElement(By.xpath("//input[@id=\"password_1\"]")).sendKeys("Selenium&25??");
        setText("//input[@id=\"password_1\"]","xpath",newPassword);
    }

    @And("confirm new password ,user enters new password again {string}")
    public void confirmNewPasswordUserEntersNewPasswordAgain(String newPassword) {
        //driver.findElement(By.xpath("//input[@id=\"password_2\"]")).sendKeys("Selenium&25??");
        setText("//input[@id=\"password_2\"]","xpath",newPassword);
    }

    @Then("click Save Changes button")
    public void clickSaveChangesButton() {

        //driver.findElement(By.name("save_account_details")).click();
        clickAnElement("save_account_details","name");
    }

    @Then("user takes the screenshot of password changed and stores it")
    public void userTakesTheScreenshotOfPasswordChangedAndStoresIt() throws IOException {

        takeScreenshot("password_Changed_Screenshot");

    }

    @Then("close browser")
    public void closeBrowser() {
        close();
    }

    @Then("user click on lost password")
    public void userClickOnLostPassword() {
       // driver.findElement(By.xpath("//a[@href=\"https://practice.automationtesting.in/my-account/lost-password/\"]")).click();
        clickAnElement("//a[@href=\"https://practice.automationtesting.in/my-account/lost-password/\"]","xpath");
    }

    @Then("user provides email address again for reset password {string}")
    public void userProvidesEmailAddressAgainForResetPassword(String email) {
        //driver.findElement(By.id("user_login")).sendKeys("rohini_s@ymail.com");
        setText("user_login","id",email);
    }

    @Then("user clicks Reset password button")
    public void userClicksResetPasswordButton() {
        //driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
        clickAnElement("//input[@value='Reset Password']","xpath");
    }

    @Then("user clicks Remember me checkbox")
    public void userClicksRememberMecheckbox() {

        //driver.findElement(By.id("rememberme")).click();
       // Set<Cookie> allCookies = driver.manage().getCookies();
        clickAnElement("rememberme","id");

    }


    @Then("Verifying user can navigates to My account page without login")
    public void verifyingUserCanNavigatesToMyAccountPageWithoutLogin() {
        driver.findElement(By.xpath("//*[text()='My Account']")).click();
        WebElement e= driver.findElement(By.xpath("//a[text()='Sign out']"));
        boolean isLabeldisplayedOrNot=e.isDisplayed();
        //Assert.assertTrue("Label is not diplayed",isLabeldisplayedOrNot);
        Assert.assertEquals("label are not matching","Sign out",e.getText());
        //driver.close();

        System.out.println("user logged into My account page successfully");
    }


    @Then("Take a screenshot of the error message displayed")
    public void takeAScreenshotOfTheErrorMessageDisplayed() throws IOException {

        takeScreenshot("password_required_Screenshot");
    }

   /* @Then("Click on My Account Menu again")
    public void clickOnMyAccountMenuAgain() throws InterruptedException
    {
        driver.findElement(By.xpath("//*[text()='My Account']")).click();
        Thread.sleep(1000);
        if (driver.findElements(By.xpath("//h2[text()='Login']")).size()>0)
        {

        }
        else {
try {


    WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='aswift_7' or @id='aswift_8']"));
    driver.switchTo().frame(frame1);
    WebElement frame2 = driver.findElement(By.id("ad_iframe"));
    driver.switchTo().frame(frame2);
    driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
    System.out.println("Closed the ad");
    driver.switchTo().defaultContent();
    System.out.println("Executed Try block");
    Thread.sleep(2000);
}
           catch (Exception ex)
            {
                System.out.println("Executed in Catch block");
                JavascriptExecutor js=(JavascriptExecutor) driver;
                String currentFrameName=(String) js.executeScript("return self.name");
                System.out.println(currentFrameName);
                WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='aswift_14' or @id='aswift_13']"));
                driver.switchTo().frame(frame1);
                WebElement frame2 = driver.findElement(By.id("ad_iframe"));
                driver.switchTo().frame(frame2);
                driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
                System.out.println("Closed the ad");
                driver.switchTo().defaultContent();
                Thread.sleep(2000);
            }
        }

    // Set<Cookie> cookiesInstance2 = driver.manage().getCookies();
     // System.out.println("Cookies = "+cookiesInstance2);
        //driver.manage().addCookie(new Cookie("cookiesInstance2","[wordpress_logged_in_4a184fc6ab3b1000027a3958ee5e0c6b=rohini_s%7C1678128543%7CSlTOfjUdQOe20P94bNAzaZgnQKHShZtILCLY5JiAnJm%7Cdbd97174d8773fb91be7cea5f898308b58695a0ab2e8071842d819d328455863; expires=Tue, 07 Mar 2023 01:49:02 EST; path=/; domain=practice.automationtesting.in;secure;; sameSite=Lax, woocommerce_cart_hash=9486573fe76cd568a2c1a23fc783a692; path=/; domain=practice.automationtesting.in;secure;; sameSite=Lax, wp_woocommerce_session_4a184fc6ab3b1000027a3958ee5e0c6b=20461%7C%7C1677091743%7C%7C1677088143%7C%7C808fcf7661fb616bc2020e88931e40d9; expires=Wed, 22 Feb 2023 01:49:02 EST; path=/; domain=practice.automationtesting.in;secure;; sameSite=Lax, __gpi=UID=000009b6beb45a3c:T=1676918934:RT=1676918934:S=ALNI_MbrRAAd0IOX8Mph8xWHFypijVDTug; expires=Sat, 16 Mar 2024 02:48:54 EDT; path=/; domain=.automationtesting.in; sameSite=Lax, woocommerce_items_in_cart=1; path=/; domain=practice.automationtesting.in;secure;; sameSite=Lax, __gads=ID=9b2fe0b34b10feed-22e24e1ca9dc00ce:T=1676918934:RT=1676918934:S=ALNI_Ma7RZ75wCUBysjnqSPG5MCzzrp9kQ; expires=Sat, 16 Mar 2024 02:48:54 EDT; path=/; domain=.automationtesting.in; sameSite=Lax]"));
        //driver.manage().addCookie(new Cookie("cookiesInstace2","+cookiesInstance1"));
    }*/


    @Then("user provides valid Email Address in login form {string}")
    public void userProvidesValidEmailAddressInLoginForm (String email)
    {
        enterUserName(email);
    }


    @And("Leave password field empty for login {string}")
    public void leavePasswordFieldEmptyForLogin (String password)
    {
        enterPassword(password);
    }

    @Then("Click on My Account Menu")
    public void clickOnMyAccountMenu() throws InterruptedException {

        clickAccountMenu();
        //closeAd();
    }

    @Then("user opens another window in same browser")
    public void userOpensAnotherWindowInSameBrowser() {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @Then("close the My Account page window")
    public void closeTheMyAccountPageWindow() {
        Set<String> whs=driver.getWindowHandles();
        System.out.println(whs.size());
        driver.switchTo().window(whs.toArray()[0].toString());
        driver.close();
    }

    @Then("user navigates to {string} opened new window")
    public void userNavigatesToOpenedNewWindow(String arg0) {
        Set<String> whs=driver.getWindowHandles();
        System.out.println(whs.size());
        driver.switchTo().window(whs.toArray()[0].toString());
        driver.get("https://practice.automationtesting.in/");
    }
}
