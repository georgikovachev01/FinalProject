//package Test2;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import java.time.Duration;
//
//public class SomeWaits {
//    protected final WebDriver driver;
//    protected WebDriverWait smallWait;
//    protected WebDriverWait wait;
//
//    public SmallWaits(WebDriver driver){
//        this.driver=driver;
//        smallWait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//    }
//
//    protected void clickElement(WebElement element){
//        smallWait.until(ExpectedConditions.elementToBeClickable(element));
//        element.click();
//    }
//
//}
