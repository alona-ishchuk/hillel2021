import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lasson16 {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //testSlider(driver);
        //timeStamp();
        //WebElement element = driver.findElement(By.xpath("//*[@class=\"site-header_nav site-nav\"]"));
        //captureElemScreen(element);
        //myScreenshot();
        //handlingPng();
        //testIFrame();
        shadowDOM();
          }


          public static void testSlider( ){
        //это бегунок


              driver.get("https://jqueryui.com/resources/demos/slider/default.html");
              WebElement mainSlider = driver.findElement(By.id("slider"));
              WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
              int width = mainSlider.getSize().width/2;
              //Actions action =
              new Actions(driver).dragAndDropBy(slider,width, 0).perform();
              //action.dragAndDropBy(resizable, 400, 400).perform();

          }


          public static String timeStamp(){

              Date d = new Date();
              //System.out.println(d);
              return d.toString().replace(':', '_').replace(' ', '_') + ".png";
          }


          public static void myScreenshot( ) throws IOException {
              //driver.get("https://odessa.ithillel.ua/");

              File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
              FileUtils.copyFile(screen, new File(".//screenshot//" + timeStamp()));

          }

          public static void captureElemScreen(WebElement element) throws IOException {
              driver.get("https://odessa.ithillel.ua/");

              File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
              FileUtils.copyFile(screen, new File(".//screenshot//" + timeStamp()));
              BufferedImage fullImg = ImageIO.read(screen);
              Point point = element.getLocation();
              int elementWidth = element.getSize().getWidth();
              int elementHeight = element.getSize().getHeight();
              BufferedImage elementScreenshot = fullImg.getSubimage(point.getX(), point.getY(), elementWidth, elementHeight);
              ImageIO.write(elementScreenshot, "png", screen);

              File screenshotLocation = new File(".\\screenshot\\myscreenshot.png");
              FileUtils.copyFile(screen, screenshotLocation);

          }


          public static void handlingPng(){
              driver.get("https://odessa.ithillel.ua/");

              List<WebElement> courses = driver.findElements(By.xpath("//*[@class=\"block-course-cats_item\"]"));
              Actions action = new Actions(driver);
              for(WebElement i : courses){
                  System.out.println(i.getText());
                  action.moveToElement(i).perform();

              }

          }

          public static void testIFrame() throws IOException {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        List <WebElement> frames = driver.findElements(By.tagName("iframe"));
              System.out.println(frames.size());

              for (WebElement frame :frames){
                  System.out.println(frame.getAttribute("id"));
              }

              myScreenshot();
    }


    public static  void shadowDOM(){
        driver.get("chrome://downloads/");
        WebElement root = driver.findElement(By.cssSelector("downloads-manager"));
        WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root);

        WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
        WebElement shadowRoot2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root2);

        WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
        WebElement shadowRoot3 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root3);

        WebElement root4 = shadowRoot3.findElement(By.cssSelector("cr-toolbar-search-field"));
        WebElement shadowRoot4 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root4);

        shadowRoot4.findElement(By.id("searchInput")).sendKeys("ouuueeee");

        //driver.findElement(By.xpath("//*[@id = \"search\"]//[@id = \"searchInput\"])"));
    }



}
