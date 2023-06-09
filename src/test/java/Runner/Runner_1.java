package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags = "@ilk or @son",
        dryRun = false


)

public class Runner_1 {

// burada kullacagimiz taglar la istedigimiz senaryolari calistirabiliriz
}
