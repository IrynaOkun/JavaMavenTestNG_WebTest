import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WebTest {

    //Тест кейс:
    //1. Открыть страницу http://www.99-bottles-of-beer.net/
    //2. Нажать пункт меню Browse Languages
    //3. Нажать пункт меню Start
    //4. Подтвердить, что пользователь видит заголовок "Welcome to 99 Bottles of Beer"
    //5. Закрыть браузер


    @Test
    public void testMenuStartTitle() {

        //задаем переменные
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";


        //действия
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);


        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );
        menuBrowseLanguages.click();
        //sleep(2000);


        WebElement menuStart = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );
        menuStart.click();


        WebElement h2 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h2")
        );
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult, expectedResult);
        //sleep(2000);

        driver.quit();


//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']
    }
}
