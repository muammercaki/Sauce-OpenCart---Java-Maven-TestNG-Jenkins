package org.first;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


public class FirstSeleniumJavaTest {

    private WebDriver driver;

    @Test
    public void testEasy() {
        beforeClass();
        driver.get("https://testautomationu.applitools.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        AssertJUnit.assertTrue(title.equals("Test Automation University | Applitools"));
        afterTest();
    }

    @Test
    public void testTwo() {

        beforeClass();
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();

        String title1 = driver.getTitle();
        System.out.println("title is " + title1);
        AssertJUnit.assertTrue(title1.equals("Google"));
        afterTest();
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}