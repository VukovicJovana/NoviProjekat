package BigPizzaBase;

import BigPizzaPages.BigPizzaLoginPage;
import BigPizzaPages.BigPizzaRegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTestBigPizza {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public BigPizzaLoginPage loginPage;
    public ExcelReader excelReader;
    public String HomeURL;
    public BigPizzaRegisterPage registerPage;
    public String registerUrl;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));

        excelReader = new ExcelReader("C:\\Users\\Jovanica\\IdeaProjects\\NoviProjekatSelenium\\Jovanica.xlsx");
        HomeURL = excelReader.getStringData("URL", 1, 0);

        loginPage = new BigPizzaLoginPage(driver);
        registerPage = new BigPizzaRegisterPage(driver);
        registerUrl = excelReader.getStringData("registerURL",1,0);
    }

    public void waitVisibility(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));

    }
    public void waitClick(WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

//    @After
//    public void tearDown() {
//        driver.close();
//        driver.quit();
//    }
}
