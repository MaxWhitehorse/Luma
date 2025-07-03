package info.esoft.qa.luma_positive_tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageTestNegative {
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
    public void addToCartNoSizeAndColor() {
        productPage.selectProduct();
        productPage.clickAddToCart();
        productPage.delay();
        assertTrue(productPage.notSelectedSizeColor());
        System.out.println("notSelectedSizeColor: " + productPage.notSelectedSizeColor());
    }
}