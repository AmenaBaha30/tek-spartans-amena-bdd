package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.base.BaseSetupPractice;

public class PracticeSetupTestSteps extends BaseSetupPractice {

    @Given("Open browser and navigate to retail app")
    public void OpenBrowserAndNavigateToRetailApp(){
        setupBrowser();
    }
    @Then("validate top left corner is TEKSCHOOL")
    public void ValidateTopLeftCornerIsTEKSCHOOL(){
       String tekSchoolLogo = getElementText(By.ByLinkText("TEKSCHOOL"));
        Assert.assertEquals("TEKSCHOOL",tekSchoolLogo);
        System.out.println(tekSchoolLogo);
    }
    @Then("Close the browser")
    public void CloseTheBrowser(){
      quitBrowser();
    }

}
