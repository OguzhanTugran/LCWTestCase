package test;

import base.BaseTest;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.*;
import models.user;
import static constants.ConstantsProductsPage.*;
import static constants.ConstantsHomepage.*;

public class mainTest extends BaseTest {
    HomePage homepage;
    LoginPage loginPage;
    ProductsPage ProductsPage;
    SpecificProductPage SpecificProductPage;
    BasketPage BasketPage;
    private static Logger logger = LogManager.getLogger(mainTest.class);

    @Before
    public void before(){
        homepage = new HomePage(getWebDriver());
        loginPage = new LoginPage(getWebDriver());
        ProductsPage = new ProductsPage(getWebDriver());
        SpecificProductPage = new SpecificProductPage(getWebDriver());
        BasketPage = new BasketPage(getWebDriver());
    }

    @Test
    public void test() throws InterruptedException {
        user user = new user("oguzhantugran1903@gmail.com", "ouzxD123.");
        Thread.sleep(5000);
        Assert.assertEquals("LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki", getWebDriver().getTitle());
        logger.info("LCW loaded successfully");
        homepage.ClickLogin();
        loginPage.setUsername(user.getUsername()).setPassword(user.getPassword()).clickLogin();
        //**Assert.assertTrue(homepage.getText(myAccountText).contains("Hesabım"));
        Thread.sleep(5000);
        logger.info("Login successful");
        homepage.ClickSearch();
        homepage.sendQuery("pantolon");
        Thread.sleep(5000);
        homepage.ClickSearchButton();
        ProductsPage.chooseRandomAndRedirect();
        Thread.sleep(5000);
        SpecificProductPage.selectSize();
        //SpecificProductPage.getProductPrice();
        SpecificProductPage.addToBasket();
        SpecificProductPage.redirectToBasket();
        Thread.sleep(5000);
        //BasketPage.getBasketProductPrice();
        //Assert.assertTrue(SpecificProductPage.getProductPrice().contains(BasketPage.getBasketProductPrice()));
        BasketPage.quantityRaise();
        Thread.sleep(5000);
        BasketPage.removeAllItemsFromBasket();
        Thread.sleep(2000);
        BasketPage.deleteButton();
        Thread.sleep(5000);
        Assert.assertTrue(BasketPage.getEmptyBasket().contains("Sepetinizde ürün bulunmamaktadır."));
        logger.info("Test is Succes");


    }

    @After
    public void after(){
       tearDown();
    }
}
