package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class BaseSetup {

    //Encapsulating driver instance
    private static WebDriver driver;

    // Fine the full path to file
    // FileInputStream to read the file
    // Properties and load the fileInputStream to the properties
    public BaseSetup() {
        try {
            String configFilePath = System.clearProperty("user.dir") +
                    "/src/test/resource/config/dev-config.properties";
            File file = new File(configFilePath);
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (
                IOException ex) {
            throw new RuntimeException("something wrong with Config file", ex);
        }

        public void setupBrowser () {
            driver = new ChromeDriver();
            driver.get("https://retail.tekschool-students.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }

        public void quitBrowser () {
            //null check before quit
            if (driver != null) {
                driver.quit();
            }
        }

        //Giving read-only indirect access to driver.
        //restrict setting new driver instance
        public WebDriver getDriver () {
            return driver;
        }
    }
}