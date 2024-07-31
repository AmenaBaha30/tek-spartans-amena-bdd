package tek.bdd.runners;


import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@CucumberOptions(
        features = "classpath: features/SetupTest.feature",
        glue = " tek.bdd.steps"
)
public class PracticeRunner {

}
