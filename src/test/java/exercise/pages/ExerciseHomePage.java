package exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseHomePage {
    public ExerciseHomePage(){
        PageFactory.initElements(exercise.utilities.Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@href='/login']")
    public WebElement login;
@FindBy(xpath = "//*[@src='/static/images/home/logo.png']")
    public WebElement homeyazisi;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedYazisi;

    @FindBy(xpath = "(//*[@style='color:brown;'])[2]")
    public WebElement deleteAccount;

}