package PageModel;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BaseModel extends Driver {

    protected final Logger log = Logger.getLogger(String.valueOf(BaseModel.class));
    public void waitSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();

            log.info("");
        }
    }


    WebDriverWait wait = new WebDriverWait(webDriver,20);


    public WebElement findElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElement(by);
    }
    public List<WebElement> findElements(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElements(by);
    }

    public void clickElement(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public String getAttribute(By by,String value){
        return findElement(by).getAttribute(value);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void switchToPageElement(int pageIndex) {
        ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(pageIndex));
    }

}
