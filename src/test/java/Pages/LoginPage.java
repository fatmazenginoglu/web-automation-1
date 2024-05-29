package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class LoginPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By Xbuton = By.className("modal-close");
    static By loginButton = By.className("account-nav-item");
    static By email= By.id("login-email");
    static By password= By.id("login-password-input");
    static By eyeclose= By.className("i-eye-close");
    static By eyeopen= By.className("i-eye-open");
    static By forgotpassword = By.xpath("//span[text()='Şifremi Unuttum']");
    static By login= By.cssSelector(".q-primary[type=\"submit\"]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() throws InterruptedException {
        Thread.sleep(5000);
        
    }

    public static void PopUp() throws InterruptedException {
        elementHelper.click(Xbuton);
        Thread.sleep(5000);
    }

    public static void Cookie() {
        elementHelper.click(eyeclose);
    }

    public static void SignIn() {
        elementHelper.click(login);
    }

    public static void Email() {
        elementHelper.click(email);
        elementHelper.findElement(email).sendKeys("fat12");
    }

    public static void Password() {
        elementHelper.click(password);
        elementHelper.findElement(password).sendKeys("fat12");
    }

    public static void LoginButton() throws InterruptedException {
        elementHelper.click(loginButton);
        Thread.sleep(3000);
    }

    public static void Message() {
    }

    public static void Appear() {
        elementHelper.click(eyeclose);
        elementHelper.click(eyeopen);
    }

    public static void OpenBrowser() {
    }

    public static void checkLoginPage() {
        elementHelper.checkVisible(eyeclose);
        elementHelper.checkVisible(password);
        elementHelper.checkVisible(email);
        elementHelper.checkVisible(loginButton);
        elementHelper.checkVisible(eyeclose);
        elementHelper.checkVisible(forgotpassword);


    }
}
