package constants;
import org.openqa.selenium.By;

public class ConstantsHomepage {
    public static final By Title = By.xpath("//title");
    public static final By LoginButton = By.xpath("//span[text()='Giriş Yap']");
    public static final By searchTextbox = By.id("search_input");
    public static final By searchButton = By.xpath("//button[text()='Ara']");
}
