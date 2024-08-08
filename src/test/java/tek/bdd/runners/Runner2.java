package tek.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class Runner2 {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "classpath/setupTest.feature",
            glue = "tek.bdd.steps"
    )
    public static class TestRunner{

    }
}
