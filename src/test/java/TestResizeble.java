import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TestResizeble {

    public static void main(String[] args) {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement resizable = driver.findElement(By.xpath("//div[@id=\"resizable\"]/div[3]"));
            Actions action =new Actions(driver);
            action.dragAndDropBy(resizable, 400, 400).perform();
        }
}
