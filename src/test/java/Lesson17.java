import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class Lesson17 {
    public static WebDriver driver;
    public static int currentDay;
    public static int currentMonth;
    public static int currentYear;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //lostId();
        //mouseOver();
        dataPicker();

    }
    public static void checkBoxes(){

        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
        //driver.findElement(By.xpath("//div[4]/input[1]")).click();
        //driver.findElement(By.xpath("//div[4]/input[2]")).click();
        //driver.findElement(By.xpath("//div[4]/input[3]")).click();
        //driver.findElement(By.xpath("//div[4]/input[4]")).click();
        WebElement block = driver.findElement(By.xpath("//div[4]"));
        List<WebElement> checkboxes =block.findElements(By.name("sports"));
        System.out.println("Total amount of checkboxes is: " + checkboxes.size());
        for (WebElement checkbox: checkboxes) {
            checkbox.click();
        }



    }

    public static void radioButtons() {
        driver.get("https://echoecho.com/htmlforms10.htm");
        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

        for (int i=0; i<count; i++) {
            System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
            driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
        }

    }

    public static void fluent(){
        //comment implisity wait

        driver.get("https://odessa.ithillel.ua/");
        WebElement accept = driver.findElement(By.xpath("//button[contains(text(),'Принять')]"));

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
                withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .withMessage("Time out after 10 seconds")
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(accept));
        System.out.println(accept.getText()+" Seems that it's OK!");

    }


    public static void lostId(){
        driver.get("https://accounts.google.com/");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement nextBut = driver.findElement(By.xpath("(//*[@class='VfPpkd-vQzf8d'])[1]"));

        //email.sendKeys("text");
        while(email.isDisplayed()){
            email.sendKeys("some@mail.com");
            nextBut.click();
            WebElement text = driver.findElement(By.xpath("//span[starts-with(text(), \"Не удалось войти в аккаунт\")]"));
            System.out.println(text);
            driver.findElement(By.xpath("//span[starts-with(text(), \"Повторить попытку\")]")).click();

            email = driver.findElement(By.xpath("//input[@type='email']"));
            nextBut = driver.findElement(By.xpath("(//*[@class='VfPpkd-vQzf8d'])[1]"));

        }


    }

    public static void mouseOver(){

        driver.get("https://www.americangolf.co.uk/");

        Actions action =  new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@class='a-level-1'][normalize-space()='Golf Clubs']"))).perform();
        driver.findElement(By.xpath("//div[@id='CLUBS_1']//span[@class='name'][normalize-space()='Ladies Golf Clubs']")).click();
        System.out.println(driver.findElement(By.xpath("//h1[@class='search-result-title heading-1']")).getText());
    }

    public static  void keyCombination(){


        driver.get("https://gmail.com");
    }

    public static void dataPicker(){
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
    }


    public static void getCurrentDate(){
        java.util.Calendar cal = java.util.Calendar.getInstance();
        currentDay = cal.get(Calendar.DAY_OF_MONTH);
        currentMonth = cal.get(Calendar.MONTH);
        currentYear = cal.get(Calendar.YEAR);
    }

    public static void getTargetDate(){



    }
}
