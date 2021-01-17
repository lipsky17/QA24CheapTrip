package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FeedbackFormHelper;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import java.io.File;

public class FeedbackFormValidation extends TestBase {
    FeedbackFormHelper feedbackFormHelper;

    @BeforeMethod
    public void unitTests(){
        feedbackFormHelper = PageFactory.initElements(driver, FeedbackFormHelper.class);
    }

    @Test(priority = 1, groups = "UI")
    public  void isTableDisplayed() throws InterruptedException{
        Thread.sleep(5000);
assert feedbackFormHelper.isTablePresent();
    }

    @Test(priority = 1, groups = "UI")
    public void isSubmitButtonDisplayed() throws InterruptedException{
        Thread.sleep(2000);
        assert feedbackFormHelper.isSubmitButtonPresent();
    }

    @Test(priority = 1, groups = {"Functional", "Buttons"})
    public void clickOnYes1()throws InterruptedException{
        Thread.sleep(2000);
        feedbackFormHelper.answerYes1();
    }

    @Test(priority = 4, groups = {"Functional", "Buttons"})
    public void clickOnYes2()throws InterruptedException{
        Thread.sleep(2000);
        feedbackFormHelper.answerYes2();
    }

    @Test(priority = 2, groups = {"Functional", "Buttons"})
    public void clickOnNo1()throws InterruptedException{
        Thread.sleep(2000);
        feedbackFormHelper.answerNo1();
    }

    @Test(priority = 5, groups = {"Functional", "Buttons"})
    public void clickOnNo2()throws InterruptedException{
        Thread.sleep(2000);
        feedbackFormHelper.answerNo2();
    }

    @Test (priority = 3, groups = {"Functional", "Buttons"})
    public void clickOnDecline1()throws InterruptedException{
        Thread.sleep(2000);
        feedbackFormHelper.declineAnswer1();
    }

    @Test (priority = 6, groups = {"Functional", "Buttons"})
    public void clickOnDecline2()throws InterruptedException{
        Thread.sleep(2000);
        feedbackFormHelper.declineAnswer2();
    }

    @Test(priority = 1, groups = {"Functional", "Buttons"})
    public void clickSubmit()throws InterruptedException{
        Thread.sleep(2000);
        feedbackFormHelper.clickOnSubmitButton();
    }

}
