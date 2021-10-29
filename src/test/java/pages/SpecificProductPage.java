package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsBasketPage.basketPrice;
import static constants.ConstantsSpecificProductPage.*;

public class SpecificProductPage extends BasePage {

    public SpecificProductPage(WebDriver webDriver){
        super(webDriver);
    }


    public String getProductPrice(){

        return findElement(totalPrice).getText();
    }

    public SpecificProductPage selectSize(){
        click(sizeButton);
        return this;
    }

    public SpecificProductPage addToBasket(){
        clickWithEvent(addToBasketButton);
        return this;
    }

    public SpecificProductPage redirectToBasket(){
        click(goToTheBasketButton);
        return this;
    }

}
