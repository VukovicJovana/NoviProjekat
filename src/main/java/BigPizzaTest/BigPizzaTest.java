package BigPizzaTest;

import BigPizzaBase.BaseTestBigPizza;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BigPizzaTest extends BaseTestBigPizza {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);

    }

    @Test(priority = 10)
    public void userCanLogIn() {

        String validEmail = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        waitVisibility(loginPage.getLoginButton());
        loginPage.inputemailaddress(validEmail);
        loginPage.inputgetPassword(validPassword);
        loginPage.clickLogin();
    }

    @Test(priority = 20)

    public void inputValidCredentialsAndLogIN() {
        String validEmail = excelReader.getStringData("Login", 1, 0);
        loginPage.inputemailaddress(validEmail);

        String validPassword = excelReader.getStringData("Login", 1, 2);
        loginPage.inputgetPassword(validPassword);
        loginPage.clickLogin();}



}





