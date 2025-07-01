package info.esoft.qa.luma_positive_tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Page;

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
    }

    @Test
    public void testAddToCart() {
        productPage.selectSizeM();
        productPage.selectColorRed();
        productPage.clickAddToCart();

    }
}