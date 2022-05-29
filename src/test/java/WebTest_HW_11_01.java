import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Locale;


public class WebTest_HW_11_01 {


    @Test
    public void testReadMainTitle() {

/*
    TC_11_01 Подтвердите, что на странице по базовой ссылке в правом верхнем углу
    пользователь видит заголовок 99 Bottles of Beer
    Шаги:
           1. Открыть вебсайт на базовой странице
            2. Считать заголовок в правом верхнем углу
            3. Подтвердить, что текст заголовка соответствует ожидаемому
            4. Закрыть браузер
*/


        //задаем переменные
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";


        //действия
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);


        WebElement title = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='header']/h1")
        );
        String actualResult = title.getText();
        //


        Assert.assertEquals(actualResult, expectedResult);
        //sleep(2000);

        driver.quit();


    }


    @Test

    public void testCheckNameLastTab() {

        /*
        TC_11_02 Подтвердите, что на странице по базовой ссылке
       последний пункт меню называется Submit new Language

        Шаги:
        1. Открыть вебсайт на базовой странице
        2. Считать название последнего пункта меню
        3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
        4. Закрыть браузер

         */

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement lastTabText = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']//li//a[@href='/submitnewlanguage.html']")
        );


        String actualResult = lastTabText.getText();

        Assert.assertEquals(actualResult, expectedResult.toUpperCase());

        driver.quit();

    }

    @Test

    public void testCheckTitleSubmit () {

        /*
        TC_11_03 Подтвердите, что на странице по базовой ссылке
        последний пункт меню имеет подзаголовок Submit new Language

        Шаги:
        1. Открыть вебсайт на базовой странице
        2. Нажать на пункт меню Submit new Language
        3. Считать название подзаголовка последнего пункта меню
        4. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
        5. Закрыть браузер
        */

        String chromeDriver = "webdriver.chrome.driver";
        String drivePath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver, drivePath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement tabSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']//li//a[@href='/submitnewlanguage.html']")
        );
        tabSubmitNewLanguage.click();


        WebElement titleText = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']//a")
        );

        String actualResult = titleText.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();



    }

    @Test

    public void testFirstSubMenu09() {

        /*
        TC_11_04 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/abc.html ,
        первый пункт подменю называется 0-9
        Шаги:
        1. Открыть вебсайт на странице
        2. Считать название первого подзаголовка
        3. Подтвердить, что название подменю соответствует ожидаемому
        4. Закрыть браузер
         */

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement firstTab = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']//a")
        );

        String actualResult = firstTab.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    @Test

    public void testNameOfCreators() {

        /*
        TC_11_06 Подтвердите, что имена создателей сайта:
        Oliver Schade
        Gregor Scheithauer
        Stefan Scheler
        Шаги:
        Напишите самостоятельно (найдите информацию о создателях на сайте,
        и опишите шаги для навигации и исполнения тест кейса)

        Steps:
        1. Открыть вебсайт на базовой странице
        2. Нажать на пункт подменю Team
        3. Считать название 1, 2, 3 члена команды
        4. Подтвердить, что их имена соотв ожидаемому
        5. Закрыть браузер

         */

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String [] expectedResult = {"Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"};

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement teamPage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a")
        );
        teamPage.click();

        WebElement firstName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[1]")
        );

        WebElement secondtName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[2]")
        );

        WebElement thirdName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[3]")
        );

        String [] actualResult = {firstName.getText(), secondtName.getText(), thirdName.getText()};

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    @Test




  }


