import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lesson19 {
    public static WebDriver driver;
    public static int currentDay;
    JavascriptExecutor js;


    //public static void main(String[] args) {

    //}

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;

    }

    @Test
    public void javaScript(){
       js.executeScript("window.location = 'https://odessa.ithillel.ua/';");

       //scroll down
        js.executeScript("window.scrollBy(0, 1500);");

        WebElement review = driver.findElement(By.xpath("//a[@class='link h2-reviews']"));
        js.executeScript("arguments[].scrollIntoView(true);", review);
        //js.executeScript()
    }


}
