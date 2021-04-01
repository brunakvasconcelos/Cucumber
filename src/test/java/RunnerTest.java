import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\Bruna\\atividadeLogin\\src"},
        plugin = { "pretty", "html:target/cucumber-html-reports"
        },
        monochrome = true,
        strict = false
)
public class RunnerTest {

    }
