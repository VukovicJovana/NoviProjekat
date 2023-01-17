package BigPizzaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigPizza {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement testLogInPage;
    WebElement testExceptions;

    public BigPizza(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getTestLogInPage() {
        return driver.findElement(By.linkText("Test Login Page"));
    }

    public WebElement getTestExceptions() {
        return driver.findElement(By.linkText("Test Exceptions"));
    }

    //----------------------------------

    public void clickTestLogIn(){
        this.getTestLogInPage().click();
    }

    public void clickTestExceptions(){
        this.getTestExceptions().click();
    }

}

