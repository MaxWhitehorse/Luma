package info.esoft.qa.luma_positive_tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PageTest {
    private static WebDriver driver;
    private static Page productPage;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage = new Page(driver);
        productPage.open();
        /*System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe"); // Путь к EdgeDriver
    driver = new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    productPage = new Page(driver);
    productPage.open();*/
    }

    @Test
    public void testAddToCart() {
        productPage.selectProduct();
        productPage.saveProductName();
        productPage.selectSizeM();
        productPage.selectColorBlackMen();
        productPage.clickAddToCart();
        productPage.delay();
        productPage.showMiniCart();
        productPage.delay();
        productPage.goToCart();
        productPage.cartCheck();
        productPage.deleteFromCart();
    }
}