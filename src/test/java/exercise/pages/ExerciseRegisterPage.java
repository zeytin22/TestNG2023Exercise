package exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseRegisterPage {
    public ExerciseRegisterPage(){
        PageFactory.initElements(exercise.utilities.Driver.getDriver(),this);
    }
    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement registerYazisi;
    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement gender;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement newsletter;
    @FindBy(xpath = "//*[@id='optin']")
    public WebElement optin;
    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id='company']")
    public WebElement company;
    @FindBy(xpath = "//*[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//*[@id='mobile_number']")
    public WebElement mobileNumber;
    @FindBy(xpath = "//*[@id='address2']")
    public WebElement address2;
    @FindBy(xpath = "//*[@id='address1']")
    public WebElement address1;
    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement createAccount;
    @FindBy(xpath = "//*[@id='days']")
    public WebElement days;
    @FindBy(xpath = "//*[@id='months']")
    public WebElement months;
    @FindBy(xpath = "//*[@id='years']")
    public WebElement years;
    @FindBy(xpath = "//*[@id='country']")
    public WebElement country;

}
