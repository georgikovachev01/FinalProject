import Test23.FindBy;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;


public class Test2 {

private static WebDriver driver;
    final String registerUrl = "http://161.35.202.130/users/register";

    @FindBy(css = "input.file[type='file']")
    WebElement fileUploadInput;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://training.skillo-bg.com:4200/posts/all");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println(driver.getTitle());



        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();

//        WebElement register = driver.findElement(By.linkText("Register"));
//        register.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.name("usernameOrEmail"));
        username.click();
        username.sendKeys("georgi33");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.click();
        password.sendKeys("testtest");

        WebElement signIn = driver.findElement(By.id("sign-in-button"));
        signIn.click();

        WebElement profile = driver.findElement(By.id("nav-link-profile"));
        profile.click();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement newPost = driver.findElement(By.id("nav-link-new-post"));
        newPost.click();

        WebElement browse = driver.findElement(By.cssSelector("input.file[type='file']"));
        browse.click();
//
//        @FindBy(css = "input.file[type='file']")
//
//        public void uploadPhoto(String relativePath) {
//            WebElement fileInput = driver.findElement(By.id("fileInput"));
//            String absolutePath = Paths.get("src/test/picture/IMG-5966.jpg").toAbsolutePath().toString() + relativePath;
//            fileInput.sendKeys(absolutePath);
//            WebElement submitButton = driver.findElement(By.id("submitButton"));
//            submitButton.click();
//        }

//WebElement exit = driver.findElement(By.className("fas"));
//exit.click();

//        driver.close();
//        System.out.println("Upload picture");
//        newPostPage.uploadImage();
    }

    public void uploadImage(File file){
        fileUploadInput.sendKeys(file.getAbsolutePath());


    }
}