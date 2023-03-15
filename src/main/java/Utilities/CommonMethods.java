package Utilities;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class CommonMethods
{
    protected static WebDriver driver;

    public CommonMethods()
    {
        driver=DriverManagement.getDriver();
    }
    public void clickAnElement(String locator,String locatorType)
    {
        if(locatorType.equals("xpath"))
        {
            driver.findElement(By.xpath(locator)).click();
        } 
        else if (locatorType.equals("id"))
        {
           driver.findElement(By.id(locator)).click();
        } else if (locatorType.equals("tagName"))
        {
            driver.findElement(By.tagName(locator)).click();
        } 
        else if (locatorType.equals("name"))
        {
            driver.findElement(By.name(locator)).click(); 
        } else if (locatorType.equals("class")) 
        {
            driver.findElement(By.className(locator)).click();
        } else if (locatorType.equals("linkText")) 
        {
            driver.findElement(By.linkText(locator)).click(); 
        } else if (locatorType.equals("partialLinkText"))
        {
            driver.findElement(By.partialLinkText(locator)).click();
        } else if (locatorType.equals("cssSelector"))
        {
            driver.findElement(By.cssSelector(locator)).click();
        }
        else
        {
            System.out.println("Unable to find locator type");
        }
    }
    public void setText(String locator,String locatorType,String text)
    {
        if(locatorType.equals("xpath"))
        {
            driver.findElement(By.xpath(locator)).sendKeys(text);
        }
        else if (locatorType.equals("id"))
        {
            driver.findElement(By.id(locator)).sendKeys(text);
        } else if (locatorType.equals("tagName"))
        {
            driver.findElement(By.tagName(locator)).sendKeys(text);
        }
        else if (locatorType.equals("name"))
        {
            driver.findElement(By.name(locator)).sendKeys(text);
        } else if (locatorType.equals("class"))
        {
            driver.findElement(By.className(locator)).sendKeys(text);
        } else if (locatorType.equals("linkText"))
        {
            driver.findElement(By.linkText(locator)).sendKeys(text);
        } else if (locatorType.equals("partialLinkText"))
        {
            driver.findElement(By.partialLinkText(locator)).sendKeys(text);
        } else if (locatorType.equals("cssSelector"))
        {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }
        else
        {
            System.out.println("Unable to identify locator type");
        }
    }
    public void switchToFrameWithName(String name)
    {
        driver.switchTo().frame(name);
    }
    public void switchToFrameWithId(String id)
    {
        driver.switchTo().frame(id);
    }
    public void switchToDefaultContent()
    {
        driver.switchTo().defaultContent();
    }
    public void get(String url)
    {
        driver.get(url);
    }
    public void close()
    {
        driver.close();
    }

    public void clearField(String locator,String locatorType)
    {
        if(locatorType.equals("xpath"))
        {
            driver.findElement(By.xpath(locator)).clear();
        }
        else if (locatorType.equals("id"))
        {
            driver.findElement(By.id(locator)).clear();
        } else if (locatorType.equals("tagName"))
        {
            driver.findElement(By.tagName(locator)).clear();
        }
        else if (locatorType.equals("name"))
        {
            driver.findElement(By.name(locator)).clear();
        } else if (locatorType.equals("class"))
        {
            driver.findElement(By.className(locator)).clear();
        } else if (locatorType.equals("linkText"))
        {
            driver.findElement(By.linkText(locator)).clear();
        } else if (locatorType.equals("partialLinkText"))
        {
            driver.findElement(By.partialLinkText(locator)).clear();
        } else if (locatorType.equals("cssSelector"))
        {
            driver.findElement(By.cssSelector(locator)).clear();
        }
        else
        {
            System.out.println("Unable to find locator type");
        }
    }

    public void takeScreenshot(String screenShotName) throws IOException {
        TakesScreenshot sc=(TakesScreenshot)driver;
        File sourceFile=sc.getScreenshotAs(OutputType.FILE);
        // File destinationFile=new File("C:\\Rohini\\screenshot1.jpg");
        File destinationFile=new File(System.getProperty("user.dir")+"//target//"+screenShotName+".png");
        FileUtils.copyFile(sourceFile,destinationFile);
    }
    public  boolean isDisplayed(String locator,String locatorType)
    {
        if (locatorType.equals("xpath"))
        {
            return driver.findElement(By.xpath(locator)).isDisplayed();
        }
        else if (locatorType.equals("id"))
        {
            return driver.findElement(By.id(locator)).isDisplayed();
        } else if (locatorType.equals("tagName"))
        {
            return driver.findElement(By.tagName(locator)).isDisplayed();
        }
        else if (locatorType.equals("name"))
        {
            return driver.findElement(By.name(locator)).isDisplayed();
        } else if (locatorType.equals("class"))
        {
            return driver.findElement(By.className(locator)).isDisplayed();
        } else if (locatorType.equals("linkText"))
        {
            return driver.findElement(By.linkText(locator)).isDisplayed();
        } else if (locatorType.equals("partialLinkText"))
        {
            return driver.findElement(By.partialLinkText(locator)).isDisplayed();
        } else if (locatorType.equals("cssSelector"))
        {
            return driver.findElement(By.cssSelector(locator)).isDisplayed();
        }
        else

            System.out.println("Unable to find locator type");
            return false;
    }
    public void assertTrue(String message,boolean assertion)
    {
        Assert.assertTrue(message, assertion);

    }
    public void closeAd()
    {
        /*WebElement frame1= driver.findElement(By.xpath("//iframe[@id='aswift_14' or @id='aswift_13' or @id='aswift_8' or @id='aswift_7']"));
        driver.switchTo().frame(frame1);
        //WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        WebElement frame2=driver.findElement(By.id("//iframe[@id='ad_iframe']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_14' or @id='aswift_13' or @id='aswift_7' or @id='aswift_8']")));
        //WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='aswift_14' or @id='aswift_13' or @id='aswift_7' or @id='aswift_8']"));*/

        try {
            driver.switchTo().frame("aswift_8");
            driver.switchTo().frame("ad_iframe");
            driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
            driver.switchTo().defaultContent();
        }
        catch(Exception e)
        {
            driver.switchTo().frame("aswift_7");
            driver.switchTo().frame("ad_iframe");
            driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
            driver.switchTo().defaultContent();
        }
    }
}
