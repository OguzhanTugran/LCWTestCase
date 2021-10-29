package base;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    static WebDriver webDriver = null;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oguzh\\Desktop\\Oguzhan Tugran Dosyalar\\chromedriver_win32 (2)\\chromedriver2.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
    }

    public static void setWebDriver(WebDriver webDriver){
        BaseTest.webDriver = webDriver;
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public void tearDown(){
        getWebDriver().quit();
    }

}
