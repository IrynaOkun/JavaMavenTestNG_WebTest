import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
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

    public void testEmptyFieldError() {

        /*
        TC_11_12 Precondition: Если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
        пользователь нажмет кнопку Submit Language,
        не заполнив информацию в обязательных полях, будет показана ошибка с текстом

        Error: Precondition failed - Incomplete Input.

        Подтвертите, что в тексте ошибки слова Error, Precondition, Incomplete и Input
        написаны с большой буквы, а слово failed  написано  с маленькой буквы.
        Так же подтвердите, что в тексте ошибки содержатся знаки :, -  и .

                Шаги:
        1. Открыть вебсайт на странице
        2. Нажать на кнопку Submit Language
        3. Считать текст ошибки
        4. Подтвердить requirenments
        5. Закрыть браузер
*/

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult1 = "Error";
        String expectedResult2 = "Precondition";
        String expectedResult3 = "Incomplete";
        String expectedResult4 = "Input";
        String expectedResult5 = "failed";
        String expectedResult6 = ":";
        String expectedResult7 = "-";
        String expectedResult8 = ".";


        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.findElement(By.xpath("//input[@type='submit']")).click();


        WebElement checkTextError = driver.findElement(
                By.xpath("//p[@style]"));

        Assert.assertEquals(checkTextError.getText().substring(0, 5), expectedResult1);
        Assert.assertEquals(checkTextError.getText().substring(7, 19), expectedResult2);
        Assert.assertEquals(checkTextError.getText().substring(29, 39), expectedResult3);
        Assert.assertEquals(checkTextError.getText().substring(40, 45), expectedResult4);
        Assert.assertEquals(checkTextError.getText().substring(20, 26), expectedResult5);
        Assert.assertEquals(checkTextError.getText().substring(5, 6),expectedResult6);
        Assert.assertEquals(checkTextError.getText().substring(27, 28), expectedResult7);
        Assert.assertEquals(checkTextError.getText().substring(45), expectedResult8);


        driver.quit();


    }

    @Test

    public void testSeeImportant() {

        /*
        TC_11_21 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
        пользователь видит предупреждение IMPORTANT:,
        написанное белыми буквами bold шрифтом на красном фоне, и что все буквы - capital
        Шаги:
        1. Открыть вебсайт на странице
        2. Считать слово IMPORTANT: из списка
        3. Подтвердить requirenments
        4. Закрыть браузер
         */

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT:";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        String bold = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/" +
                        "span[@style=\"background-color:red; color: white\"]/b")
        )
                .getTagName();

        Assert.assertEquals(bold, "b");

        WebElement importantWord = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/" +
                        "span[@style=\"background-color:red; color: white\"]")
        );
        String actualResult = importantWord.getText();

        Assert.assertEquals(actualResult, expectedResult.toUpperCase());


        String backgroundColor = importantWord.getCssValue("background-color");

        Assert.assertTrue(Color.fromString("#ff00000").equals(Color.fromString(backgroundColor)));

        String color = importantWord.getCssValue("color");

        Assert.assertTrue(Color.fromString("#ffffff").equals(Color.fromString(color)));

        driver.quit();

    }




  }


