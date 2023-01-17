package BigPizzaTest;

import BigPizzaBase.BaseTestBigPizza;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BigPizzaRegister extends BaseTestBigPizza {


    @BeforeMethod
    public void setUpPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(registerUrl);
    }

    @Test
    public void BigPizzaRegister() {

        WebElement firstname = driver.findElement(By.id("register_user_form_firstName"));
        firstname.clear();
        firstname.sendKeys("Jovana");

        WebElement lastname = driver.findElement(By.id("register_user_form_lastName"));
        lastname.clear();
        lastname.sendKeys("Vukovic");

        WebElement emailaddres = driver.findElement(By.id("register_user_form_email"));
        emailaddres.clear();
        emailaddres.sendKeys("staniloka@gmail.com");

        WebElement pasword = driver.findElement(By.id("register_user_form_plainPassword_first"));
        pasword.clear();
        pasword.sendKeys("lokalela2693");

        WebElement phonenumber = driver.findElement(By.id("register_user_form_phoneNumber"));
        phonenumber.clear();
        phonenumber.sendKeys("0605466975");

        WebElement repeatpassword = driver.findElement(By.id("register_user_form_plainPassword_second"));
        repeatpassword.clear();
        repeatpassword.sendKeys("lokalela2693");


        WebElement register = driver.findElement(By.xpath("//*[@id=\"register\"]/div/div[2]/form/div[2]/div[8]/div[2]/button"));
        register.click();
    }




}




