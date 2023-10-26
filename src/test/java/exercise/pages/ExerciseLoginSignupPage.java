package exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseLoginSignupPage {
    public ExerciseLoginSignupPage(){
        PageFactory.initElements(exercise.utilities.Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newusersignup;
    @FindBy(xpath = "//*[@placeholder='Name']")
    public WebElement name;
    @FindBy(xpath = "(//*[@placeholder='Email Address'])[2]")
    public WebElement email;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUp;
}
