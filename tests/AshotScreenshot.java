package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class AshotScreenshot {
    @Test
    public void fullScreenUsingAShot() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdq-5XxSDlosGda8c9hh9MbfPDT-sfAyLWxbS8OOUgQl_XwTw/viewform?embedded=true");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Screenshot screenshot = new AShot().takeScreenshot(driver);

        File outputfile = new File("C:\\Testing\\Screenshots\\fullimage.png");
        ImageIO.write(screenshot.getImage(), "png", outputfile);

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void biggerThenScreenSizeUsingAShot() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdq-5XxSDlosGda8c9hh9MbfPDT-sfAyLWxbS8OOUgQl_XwTw/viewform?embedded=true");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(1000))
                .takeScreenshot(driver);

        File outputfile = new File("C:\\Testing\\Screenshots\\bigimage.png");
        ImageIO.write(screenshot.getImage(), "png", outputfile);

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void elementScreenshotUsingAShot() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdq-5XxSDlosGda8c9hh9MbfPDT-sfAyLWxbS8OOUgQl_XwTw/viewform?embedded=true");
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[3]/div[1]/div/div/span/span"));
        //Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, element);
        //Screenshot screenshot = new AShot().takeScreenshot(driver, element);
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
        File outputfile = new File("C:\\Testing\\Screenshots\\elementimage.png");
        ImageIO.write(screenshot.getImage(), "png", outputfile);

        Thread.sleep(3000);
        driver.quit();
    }
}
