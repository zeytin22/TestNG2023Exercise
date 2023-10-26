package exercise.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    //    Driver.getDriver(); -> driver
    private static WebDriver driver;
    private static exercise.utilities.ConfigReader ConfigReader;

    //    getDriver() is used to instantiate the driver object
    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    driver=new FirefoxDriver();
                    break;


                case "edge":
                    driver=new EdgeDriver();
                    break;
            }

//            NOTE: sel 4.5
//            driver = WebDriverManager.chromedriver().create();

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
    //    closeDriver() is used to close the driver
    public static void closeDriver(){
//        if driver is already being used(pointing an object)
//        then quit the driver
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
