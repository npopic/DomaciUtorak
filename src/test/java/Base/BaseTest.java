package Base;

import Pages.HomePage;
import Pages.SideBarPage;
import Pages.WebTablesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {


    public WebDriver driver;
    public HomePage homePage;
    public SideBarPage sideBarPage;
    public JavascriptExecutor js;
    public ExcelReader excelReader;

    public WebTablesPage webTablesPage;

    @BeforeClass

    public void setUp() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        js = (JavascriptExecutor) driver;

        homePage = new HomePage(driver);
        sideBarPage = new SideBarPage(driver);
        excelReader = new ExcelReader("DomaciPOM.xlsx");
        webTablesPage = new WebTablesPage(driver);
    }

    @AfterClass

    public void tearDown() {

        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
