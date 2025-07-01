import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //устанавливает неявное ожидание (implicit wait) для всех последующих операций поиска элементов на странице

        //Поиск элементов
        driver.get("https://magento.softwaretestingboard.com/montana-wind-jacket.html");
        WebElement cartSize = driver.findElement(By.xpath("//*[@id='option-label-size-143-item-168']"));
        cartSize.click();
        WebElement cartColor = driver.findElement(By.xpath("//*[@id='option-label-color-93-item-58']"));
        cartColor.click();
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
        addToCartButton.click();
    }

}
