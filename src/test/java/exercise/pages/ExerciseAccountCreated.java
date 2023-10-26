package exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseAccountCreated {
    public ExerciseAccountCreated(){
        PageFactory.initElements(exercise.utilities.Driver.getDriver(),this);
    }
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement createdYazisi;
    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueYazisi;
    @FindBy(xpath = "(//*[@fill='#5F6368'])[1]")
    public WebElement alert;


}
