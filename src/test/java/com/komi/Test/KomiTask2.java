package com.komi.Test;

import com.komi.Base.TestBase;
import com.komi.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KomiTask2 extends TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testdummy.komi.io/");

    }
    @Test

    public void SongImage() {

        // User checks if all the thumbnail images are loaded and visible

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        WebElement SongImage = driver.findElement(By.xpath("//*[@id=\"e7729fbc-edb6-41de-951d-23784df5b1ce\"]/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/img[2]"));

        if (SongImage.isDisplayed()) {
            System.out.println("Image is visible");
        } else {
            System.out.println("Image is not visible");
        }
    }

    @Test
    public void KomiButton() {

        // Clicking on the section title at the top takes you to the right module

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        WebElement Komi = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[2]/div[4]/button"));
        Komi.click();

        driver.quit();
    }

    @Test
    public void side_navigation_arrow() {

        // User clicks on the side navigation arrow on the ”Music Tracks” module and validates the paging and data.

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        WebElement NagigationNarrow = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[6]/div[1]/div[1]/div/div[2]/button[2]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(NagigationNarrow).perform();
        NagigationNarrow.click();

        Actions actions1 = new Actions(driver);
        actions.moveToElement(NagigationNarrow).perform();

        NagigationNarrow.click();

        driver.quit();

    }

    @Test
    public void PreSaveButton() throws InterruptedException {

        //User clicks on “Pre-Save” button and validates the button changes to “Pre-saved”

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        WebElement PreSaveButton = driver.findElement(By.xpath("//span[@class='ant-typography text text--semibold14 undefined']"));
        PreSaveButton.click();

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@id='login-username']"));
        email.sendKeys("ertugbatar@hotmail.com" + Keys.ENTER);

        WebElement password = driver.findElement(By.xpath("//input[@id='login-password']"));
        password.sendKeys("21111988.Eertug" +Keys.ENTER);

        WebElement agreeButton = driver.findElement(By.xpath("//div[@class='ButtonInner-sc-14ud5tc-0 Eyhro encore-bright-accent-set']"));
        agreeButton.click();


    }
}

