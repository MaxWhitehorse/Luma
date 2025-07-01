package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
    private final WebDriver driver;

    // Локаторы элементов
    private final By sizeMBtn = By.xpath("//*[@id='option-label-size-143-item-168']");
    private final By colorRedBtn = By.xpath("//*[@id='option-label-color-93-item-58']");
    private final By addToCartBtn = By.xpath("//button[@title='Add to Cart']");

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(pages.PageUrl.MONTANA_WIND_JACKET);
    }

    // Методы взаимодействия с элементами
    public void selectSizeM() {
        WebElement cartSize = driver.findElement(sizeMBtn);
        cartSize.click();
    }

    public void selectColorRed() {
        WebElement cartColor = driver.findElement(colorRedBtn);
        cartColor.click();
    }

    public void clickAddToCart() {
        WebElement addToCartButton = driver.findElement(addToCartBtn);
        addToCartButton.click();
    }
}