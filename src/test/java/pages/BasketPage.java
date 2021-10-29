package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static constants.ConstantsBasketPage.*;


public class BasketPage extends BasePage {

    public BasketPage(WebDriver webDriver){
        super(webDriver);
    }

    public String getBasketProductPrice(){
        return findElement(basketPrice).getText();
    }

    public String getEmptyBasket(){
        return findElement(emptyBasket).getText();
    }

    public BasketPage quantityRaise(){
        click(quantityRaise);
        return this;
    }

    public BasketPage removeAllItemsFromBasket() {
        click(removeButton);
        return this;

    }
    public BasketPage deleteButton(){
        click(deleteCheckButton);
       return this;
    }

}
