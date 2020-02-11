package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources",
        glue = "Steps",
        plugin = {"json:target/cucumber.json"},
        tags = ""
)
public class TestRunner {

}
