package exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseAccountDeleted {
    public ExerciseAccountDeleted(){
        PageFactory.initElements(exercise.utilities.Driver.getDriver(),this);
    }
    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement deletedYazisi;
    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueYazisi;


}
