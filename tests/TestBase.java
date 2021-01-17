package tests;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class TestBase {
    WebDriver driver;


    @BeforeTest public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1200");
        driver = new ChromeDriver(options);
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdq-5XxSDlosGda8c9hh9MbfPDT-sfAyLWxbS8OOUgQl_XwTw/viewform?embedded=true");

    }


    @AfterTest public void quitBrowser (){
        driver.quit();
    }
}
