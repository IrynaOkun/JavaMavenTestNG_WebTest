import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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

    public void testCheckTitleSubmit() {

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
        String[] expectedResult = {"Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"};

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

        String[] actualResult = {firstName.getText(), secondtName.getText(), thirdName.getText()};

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
        Assert.assertEquals(checkTextError.getText().substring(5, 6), expectedResult6);
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

    @Test

    public void testImportantStyles() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResultStyle = "background-color: red; color: white;";
        String expectedResultBold = "b";
        String expectedResultCapital = "IMPORTANT:";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement style = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span")
        );
        String actualResultStyle = style.getAttribute("style");

        WebElement bold = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span/b")
        );
        String actualResultBold = bold.getTagName();

        WebElement capital = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span/b")
        );
        String actualResultCapital = capital.getText();

        Assert.assertEquals(actualResultStyle, expectedResultStyle);
        Assert.assertEquals(actualResultBold, expectedResultBold);
        Assert.assertEquals(actualResultCapital, expectedResultCapital.toUpperCase());

        driver.quit();

    }




    @Test
    public void testLanguageMySQL() {

        /*
        TC_12_02 Подтвердите, что в меню BROWSE LANGUAGES, подменю  M,
        последний программный язык в таблице -  MySQL

    Шаги:
    1. Открыть базовую страницу
    2. Нажать на пункт меню BROWSE LANGUAGES
    3. Нажать на подменю M
    4. Подтвердить, что последний язык программирования на странице - MySQL

         */

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "MySQL";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.findElement(By.xpath("//div/ul/li/a[@href='/abc.html']")).click();
        driver.findElement(By.xpath("//a[@href='m.html']")).click();

        WebElement lastLanguage = driver.findElement(By.xpath("//a[@href='language-mysql-1252.html']"));
        String actualResult = lastLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();


    }

    @Test

    public void testTitlesOfTable() {

        /*
        TC_12_03 Подтвердите, что в меню BROWSE LANGUAGES существует таблица с заголовками
        Language, Author, Date, Comments, Rate
         */

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Language, Author, Date, Comments, Rate,";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.findElement(By.xpath("//a[@href='/abc.html']")).click();
        WebElement titles = driver.findElement(By.xpath("//tbody/tr/th"));
        //String actualResult = titles.getText();


        String[] tableArr = new String[5];
        String actualresult = "";
        for(int i = 0; i < tableArr.length; i++) {
            tableArr[i] = driver
                    .findElement(
                            By.xpath("//tbody/tr/th[" + (i + 1) + "]")
                    ).getText();
            actualresult = actualresult.concat(tableArr[i] + ", ");
        }

        Assert.assertEquals(actualresult.trim(), expectedResult);

        //Assert.assertEquals(actualResult, expectedResult.replace(",", ""));


        driver.quit();

    }

    @Test

    public void testMathData() {

        /*
    TC_12_04 Подтвердите, что создатель решения на языке Mathematica - Brenton Bostick,
    дата обновления решения на этом языке - 03/16/06, и что это решение имеет 1 комментарий
     */

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        String languageExpected = "Mathematica";
        String authorExpected = "Brenton Bostick";
        String dataExpected = "03/16/06";
        String commentsExpected = "1";

        StringBuilder expectedResult = new StringBuilder();
        expectedResult
                .append(languageExpected)
                .append(" ")
                .append(authorExpected)
                .append(" ")
                .append(dataExpected)
                .append(" ")
                .append(commentsExpected);

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        //driver.findElement(By.xpath("//a[@href='/abc.html']")).click();
       // driver.findElement(By.xpath("//ul[@id='submenu']/li/a[@href='m.html']")).click();

        driver.findElement(By.linkText("Browse Languages")).click();
        driver.findElement(By.linkText("M")).click();

        List<WebElement> trs = driver.findElements(By.xpath("//table[@id='category']/tbody/tr"));

        WebElement tdMathematica = driver.findElement(By.linkText("Mathematica"));

        List <String> actualResult = new ArrayList<>();

        for (WebElement tr: trs) {
            if (tr.getText().contains(languageExpected)) {
                actualResult.add(tr.getText());
            }

            }

        Assert.assertEquals(actualResult.size(), 1);
        Assert.assertFalse(actualResult.get(0).isEmpty());
        Assert.assertEquals(actualResult.get(0), expectedResult.toString());

    }

}


