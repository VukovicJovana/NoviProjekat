package BigPizzaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BigPizzaRegisterPage {
    public WebDriver driver;
    WebElement firstname;
    WebElement lastname;
    WebElement emailaddress;
    WebElement password;
    WebElement phonenumber;
    WebElement repeatpassword;
    WebElement register;

    public BigPizzaRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstname() {
        return driver.findElement(By.id("register_user_form_firstName"));
    }

    public WebElement getLastname() {
        return driver.findElement(By.id("register_user_form_lastName"));
    }

    public WebElement getEmailaddress() {
        return driver.findElement(By.id("register_user_form_email"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("register_user_form_plainPassword_first"));
    }

    public WebElement getPhonenumber() {
        return driver.findElement(By.id("register_user_form_phoneNumber"));
    }

    public WebElement getRepeatpassword() {return driver.findElement(By.id("register_user_form_plainPassword_second"));
    }
    public WebElement getRegister() {
        return driver.findElement(By.xpath("//*[@id=\"register\"]/div/div[2]/form/div[2]/div[8]/div[2]/button"));
    }
    public WebElement getPovratnaporuka(){return driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/a"));
    }

    public void inputgetFirstname(String firstname) {
        this.getFirstname().clear();
        this.getFirstname().sendKeys(firstname);
    }

    public void inputgetlastname(String lastname) {
        this.getLastname().clear();
        this.getLastname().sendKeys(lastname);
    }
    public  void inputgetemailaddress(String email){
        this.getEmailaddress().clear();
        this.getEmailaddress().sendKeys(email);
    }
    public void inputgetpassword(String password){
        this.getPassword().clear();
        this.getPassword().sendKeys(password);
    }
    public void inputgetphonenumber(String number){
        this.getPhonenumber().clear();
        this.getPhonenumber().sendKeys(number);
    }
    public void inputgetrepeatpassword(String repeatpassword){
        this.getRepeatpassword().clear();
        this.getRepeatpassword().sendKeys(repeatpassword);
    }
    public void inputgetregister(String redister){
        this.getRegister().click();
    }
}



