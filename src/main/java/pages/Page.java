package pages;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
    private final WebDriver driver;
    public String productName;

    // Локаторы элементов
    private final By selectProductBtn = By.xpath("//*[@class='product-image-photo']");
    private final By productNameBtn = By.xpath("//span[@class='base' and @itemprop='name']");
    private final By sizeMBtn = By.xpath("//div[@option-label='M']");
    private final By colorBlackMenBtn = By.xpath("//div[@option-label='Black']");
    private final By addToCartBtn = By.xpath("//button[@title='Add to Cart']");
    private final By showMiniCartBtn = By.xpath("//a[@class=\"action showcart\" and @data-bind=\"scope: 'minicart_content'\"]");
    private final By goToCartBtn = By.xpath("//span[text()='View and Edit Cart']");
    private final By deleteFromCartBtn = By.xpath("//a[@title='Remove item']");



    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(pages.PageUrl.JACKETS_MEN);
    }

    // Методы взаимодействия с элементами
    public void delay() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectProduct() {
        WebElement selectProduct = driver.findElement(selectProductBtn);
        selectProduct.click();
    }

    public String saveProductName() {
        WebElement saveProductName = driver.findElement(productNameBtn);
        productName = saveProductName.getText();
        return productName;
    }

    public void selectSizeM() {
        WebElement cartSize = driver.findElement(sizeMBtn);
        cartSize.click();
    }

    public void selectColorBlackMen() {
        WebElement cartColor = driver.findElement(colorBlackMenBtn);
        cartColor.click();
    }

    public void clickAddToCart() {
        WebElement addToCart = driver.findElement(addToCartBtn);
        addToCart.click();
    }

    public void showMiniCart() {
        WebElement showMiniCart = driver.findElement(showMiniCartBtn);
        showMiniCart.click();
    }

    public void goToCart() {
        WebElement goToCart = driver.findElement(goToCartBtn);
        goToCart.click();
    }

    public void deleteFromCart() {
        WebElement deleteFromCart = driver.findElement(deleteFromCartBtn);
        deleteFromCart.click();
    }

    public void cartCheck() {
        // Создаем локатор динамически с текущим значением productName
        By cartCheckBtn = By.xpath(String.format("//a[text()='%s']", productName));
        WebElement cartCheck = driver.findElement(cartCheckBtn);
    }
}