package exercise.tests;

import exercise.pages.*;
import exercise.utilities.ConfigReader;
import exercise.utilities.Driver;
import exercise.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_start {
/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
 */
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("exercise_url"));
        ExerciseHomePage exerciseHomePage = new ExerciseHomePage();
        Assert.assertTrue(exerciseHomePage.homeyazisi.isDisplayed());
        exerciseHomePage.login.click();
        ExerciseLoginSignupPage exerciseLoginSignupPage = new ExerciseLoginSignupPage();
        Assert.assertTrue(exerciseLoginSignupPage.newusersignup.isDisplayed());
        exerciseLoginSignupPage.name.sendKeys(ConfigReader.getProperty("name"));
        exerciseLoginSignupPage.email.sendKeys(ConfigReader.getProperty("email"));
        exerciseLoginSignupPage.signUp.click();
        ExerciseRegisterPage exerciseRegisterPage =new ExerciseRegisterPage();
        Assert.assertTrue(exerciseRegisterPage.registerYazisi.isDisplayed());
        exerciseRegisterPage.name.sendKeys(ConfigReader.getProperty("name"));
        exerciseRegisterPage.password.sendKeys(ConfigReader.getProperty("password"));
        exerciseRegisterPage.days.sendKeys("day");
        exerciseRegisterPage.months.sendKeys(ConfigReader.getProperty("month"));
        exerciseRegisterPage.years.sendKeys(ConfigReader.getProperty("year"));
        exerciseRegisterPage.newsletter.click();
        exerciseRegisterPage.optin.click();
        exerciseRegisterPage.firstName.sendKeys(ConfigReader.getProperty("name"));
        exerciseRegisterPage.lastName.sendKeys(ConfigReader.getProperty("lastname"));
        exerciseRegisterPage.company.sendKeys(ConfigReader.getProperty("company"));
        exerciseRegisterPage.address1.sendKeys(ConfigReader.getProperty("address1"));
        exerciseRegisterPage.address2.sendKeys(ConfigReader.getProperty("address2"));
        exerciseRegisterPage.country.sendKeys(ConfigReader.getProperty("country"));
        exerciseRegisterPage.state.sendKeys(ConfigReader.getProperty("state"));
        exerciseRegisterPage.city.sendKeys(ConfigReader.getProperty("city"));
        exerciseRegisterPage.zipcode.sendKeys(ConfigReader.getProperty("zipcode"));
        exerciseRegisterPage.mobileNumber.sendKeys(ConfigReader.getProperty("phone"));
        exerciseRegisterPage.gender.click();
        exerciseRegisterPage.createAccount.click();
        ExerciseAccountCreated exerciseAccountCreated =new ExerciseAccountCreated();
        if (Driver.getDriver().getCurrentUrl().contains("https://automationexercise.com/#google_vignette")){
            exerciseAccountCreated.alert.click();
        } else System.out.println("devamke");

        exerciseAccountCreated.createdYazisi.isDisplayed();
        exerciseAccountCreated.continueYazisi.click();
        if (Driver.getDriver().getCurrentUrl().contains("https://automationexercise.com/#google_vignette")){
            exerciseAccountCreated.alert.click();
        } else System.out.println("devamke");
        exerciseHomePage.loggedYazisi.isDisplayed();
        exerciseHomePage.deleteAccount.click();
        if (Driver.getDriver().getCurrentUrl().contains("https://automationexercise.com/#google_vignette")){
            exerciseAccountCreated.alert.click();
        } else System.out.println("devamke");

        ExerciseAccountDeleted exerciseAccountDeleted=new ExerciseAccountDeleted();
        exerciseAccountDeleted.deletedYazisi.isDisplayed();
        exerciseAccountDeleted.continueYazisi.click();

    }
    }