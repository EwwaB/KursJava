import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class AppTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void shouldTestowkaPlPageBeOpenable() {
        driver.get("http://blog.testowka.pl");
        assertEquals(driver.getTitle(), "");
    }

    @Test
    public void szukajTesktWGoogle() throws InterruptedException {
        driver.get("https://www.google.pl/");
        WebElement webElement = driver.findElement(By.id("lst-ib")); //pole z loginem
        webElement.sendKeys("Kuba Kudła"); //wpisuje login
        webElement.submit();
        Thread.sleep(5000);
    }
    @Test
    public void szukajTesktWGooglee() throws InterruptedException {
        driver.get("https://www.google.pl/");
        WebElement webElement = driver.findElement(By.id("lst-ib" ));
        assertEquals ("lst-ib", webElement.getAttribute("id"));
        webElement.sendKeys("Kuba Kudła");
        webElement =  driver.findElement(By.name("btnK"));
        assertEquals("btnK", webElement.getAttribute("name"));
        webElement.click();
        assertEquals ("Kuba Kudłaaa", driver.findElement(By.id("lst-ib")).getAttribute("value"));
        //Thread.sleep(5000);


    }
    @Test
    public void dwaPlusDwa() {
        assertEquals(true, Boolean.TRUE);
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

}
