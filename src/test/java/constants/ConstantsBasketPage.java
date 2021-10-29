package constants;

import org.openqa.selenium.By;

public class ConstantsBasketPage {
    public static final By basketPrice = By.xpath("//span[@class='rd-cart-item-price mb-15']");
    public static final By quantityRaise = By.xpath("//a[@class='oq-up plus']");
    public static final By emptyBasket = By.xpath("//p[@class='cart-empty-title']");
    public static final By removeButton = By.xpath("//a[@title='Sil']");
    public static final By deleteCheckButton = By.xpath("//a[normalize-space(text())='Sil']");
}
