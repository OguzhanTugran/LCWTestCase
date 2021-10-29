package pages;
import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

import static constants.ConstantsProductsPage.*;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver webDriver){
        super(webDriver);
    }

    public ProductsPage chooseRandomAndRedirect(){
        click(product);
        return this;
    }



}
