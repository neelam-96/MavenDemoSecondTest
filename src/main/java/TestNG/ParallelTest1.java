package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Set;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedirever\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Lunch Chrome

        driver.get("https://www.facebook.com/");//enter URL
      //  driver.manage().window().maximize();//Maximize Window



        WebElement logo = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i"));

        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(2000);
    }

       @Test
               void homepagetitle() throws InterruptedException {
           System.setProperty("webdriver.chrome.driver", "D:\\chromedirever\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();// Lunch Chrome

           driver.get("https://www.facebook.com/");//enter URL
         //  driver.manage().window().maximize();//Maximize Window

          // driver.manage().deleteAllCookies();// delete All cookies

           Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
           Thread.sleep(2000);
       }

        @AfterTest
         void driver1()
       {
           System.out.println("Done");

       }


        }







