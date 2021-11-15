import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class GuruTest99 {

    String loginPage = "http://demo.guru99.com/Agile_Project/Agi_V1/";
    String exitPage = "http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
    WebDriver driver;



    @BeforeTest
    public void cromeDriver(){

        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //return driver;
    }



    @AfterTest
    public void driverClose(){
        driver.quit();
    }

    /*@BeforeMethod
    public void loginPage(){
        driver.get(loginPage);
    }

     */

    @BeforeClass
    public void appSetup(){
        driver.get(exitPage);
        System.out.println("Our application setup is also");
    }

    @BeforeMethod
    public void checkLogin(){
        driver.findElement(By.name("uid")).sendKeys("1303");
        driver.findElement(By.name("password")).sendKeys("Guru99");
        driver.findElement(By.name("btnLogin")).click();
        System.out.println(" The login done");
    }

    @AfterMethod
    public  void  screenShot() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File myScreen = screenshot.getScreenshotAs(OutputType.FILE);
        File first = new File ("C://test-output//test1.PNG");
        FileUtils.copyFile(myScreen, first);
    }





   @Test (description = "positive_login")
    public void positiveLogin() {


        WebElement logOutButton = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        //assertEquals(logOutButton.getText(), "Log out");
        logOutButton.click();
        //System.out.println(text);
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), exitPage);


        //driver.quit();
    }


    @Test (description = "negotive passwd")
    public void negotivePasswd() {

        driver.get(loginPage);

        driver.findElement(By.name("uid")).sendKeys("1303");
        driver.findElement(By.name("password")).sendKeys("Guru9");
        driver.findElement(By.name("btnLogin")).click();
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), exitPage);

        //WebElement logOutButton = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        //assertEquals(logOutButton.getText(), "Log out");
        //logOutButton.click();
    }




}
