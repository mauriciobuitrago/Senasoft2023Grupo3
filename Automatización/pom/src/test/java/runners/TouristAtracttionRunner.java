package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//Initial configuration so that the system understands what you write in the characteristics
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/touristAtracttion.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "stepdefinitions"
)

//Class to run the scenarios
public class TouristAtracttionRunner {
}