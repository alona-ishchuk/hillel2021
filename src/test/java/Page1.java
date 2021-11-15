import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Page1 {
    public static void main(String[] args) {

        String link = "https://www.demoqa.com/books";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(link);
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("userName")).sendKeys("HillelAuto");
        driver.findElement(By.id("password")).sendKeys("Hillel*2021");
        driver.findElement(By.id("close-fixedban")).click();
        driver.findElement(By.xpath("//button[@id='login']")).click();
        WebElement pageheader =driver.findElement(By.xpath("//div[@id=\"app\"]//div[@class=\"main-header\"]"));
        System.out.println("The header of this page is "+ pageheader.getText());
        driver.findElement(By.id("submit")).click();
        driver.quit();




    }


}
