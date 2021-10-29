package constants;

import org.openqa.selenium.By;

public class ConstantsSpecificProductPage {
    public static final By addToBasketButton = By.xpath("//a[@id='pd_add_to_cart']");
    public static final By sizeButton=By.xpath("//a[@key='2'][1]");
    public static final By totalPrice = By.xpath("//div[@id='rightInfoBar']//span[@class='price']");
    public static final By goToTheBasketButton = By.xpath("//a[@class='button dd-button dd-cart']");
}

