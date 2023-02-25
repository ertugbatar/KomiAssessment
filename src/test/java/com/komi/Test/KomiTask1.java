package com.komi.Test;

import com.komi.Base.TestBase;
import com.komi.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KomiTask1 extends TestBase {


    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://testdummy.komi.io/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void ButtonTest() {

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        //Click the Instagram
        WebElement instagram = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[2]/div[1]/button"));
        instagram.click();

        // Click the LinkedIn
        WebElement LinkedIn = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[2]/div[2]/button"));
        LinkedIn.click();

        // Click the Spotify
        WebElement Spotify = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[2]/div[3]/button"));
        Spotify.click();

        // Click the Komi
        WebElement Komi = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[2]/div[4]/button"));
        Komi.click();

        driver.quit();

    }

    @Test
    public void Header() {

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        // Click the Single Music Button
        WebElement SingleMusicBtn = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[3]/div/div/div/div[2]/button/span"));
        SingleMusicBtn.click();

        // Click the Music Tracks Button
        WebElement MusicTracks = driver.findElement(By.xpath("//span[normalize-space()='Music Tracks']"));
        MusicTracks.click();

        // Click the Pre Save Music Button
        WebElement PreSaved = driver.findElement(By.xpath("//span[normalize-space()='Pre-Save Music']"));
        PreSaved.click();

        // Click the Subscribe Button
        WebElement SubscribeBtn = driver.findElement(By.xpath("//span[normalize-space()='Subscribe']"));
        SubscribeBtn.click();

        driver.quit();

    }


    @Test
    public void MusicButton() throws InterruptedException {

        // Music Play Button Test

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        WebElement MusicBtn = driver.findElement(By.xpath("//*[@id=\"e7729fbc-edb6-41de-951d-23784df5b1ce\"]/div[1]/div[2]/div/div/div/div/div[1]/div[1]/button"));
        MusicBtn.click();

        Thread.sleep(10000);

        driver.quit();

    }


    @Test
    public void RobotImageLoaded() {

        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
        cookiesButton.click();

        WebElement RobotImage = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div/div[1]/div[1]/div[1]/div/img[2]"));

        if (RobotImage.isDisplayed()) {
            System.out.println("Image is visible");
        } else {
            System.out.println("Image is not visible");
        }

        driver.quit();

    }

    @Test
    public void ScrollDown() throws InterruptedException {

    WebElement cookiesButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-4']"));
    cookiesButton.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");


    }
}




