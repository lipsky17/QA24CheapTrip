package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedbackFormHelper extends PageBase  {
    public FeedbackFormHelper(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "mG61Hd")
    WebElement table;

    @FindBy(css = "#mG61Hd > div.freebirdFormviewerViewFormCard.exportFormCard > div.freebirdFormviewerViewFormContent > div.freebirdFormviewerViewNavigationNavControls > div.freebirdFormviewerViewNavigationButtonsAndProgress > div > div > span > span")
    WebElement submitButton;

    @FindBy(id = "i5")
    WebElement yesButton1;

    @FindBy(id = "i8")
    WebElement noButton1;

    @FindBy(id = "i19")
    WebElement yesButton2;

    @FindBy(id = "i22")
    WebElement noButton2;

    @FindBy(xpath = "//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/span/span")
    WebElement declineButton1;

    @FindBy(xpath = "//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div/span/span")
    WebElement declineButton2;


    public boolean isTablePresent(){

        return table.isDisplayed();
    }

        public boolean isSubmitButtonPresent(){
            return submitButton.isDisplayed();
    }

    public void answerYes1(){
        yesButton1.click();
    }

    public void answerNo1(){
        noButton1.click();
    }

    public void declineAnswer1(){
        declineButton1.click();
    }

    public void answerYes2(){
        yesButton2.click();
    }

    public void answerNo2(){
        noButton2.click();
    }

    public void declineAnswer2(){
        declineButton2.click();
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }
}


