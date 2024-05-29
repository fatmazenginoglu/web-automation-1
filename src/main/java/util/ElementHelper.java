package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        //this.wait = new WebDriverWait(10);
        this.actions = new Actions(driver);

    }

    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key) {
        return presenceElement(key);
    }
    public void click(By key) {
        findElement(key).click();
    }
    public void sendKeys(By key, String text) {
        findElement(key).sendKeys(text);
    }
    public void checkVisible(By key) {
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }

}
