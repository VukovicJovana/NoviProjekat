package BigPizzaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BigPizzaLoginPage {

    public WebDriver driver;
    WebElement emailaddress;
    WebElement password;
    WebElement loginButton;

    public BigPizzaLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getemailaddress() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("_submit"));
    }
    public void inputemailaddress(String email){
        this.getemailaddress().clear();
        this.getemailaddress().sendKeys(email);
    }
    public void inputgetPassword(String pass){
        this.getPassword().clear();
        this.getPassword().sendKeys(pass);
    }
    public void clickLogin(){
        this.getLoginButton().click();


    }
}
