import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\bruna.vasconcelos\\Documents\\atividadeLogin",
        plugin = "pretty"
       // monochrome = true,
       // snippets = SnippetType.CAMELCASE
)
public class Runner {
}