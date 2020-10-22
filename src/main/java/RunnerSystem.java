import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:Reports/reports.html"},
        publish = true,
        features = {"features"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "",
        glue = {"steps"}
)
public class RunnerSystem {
}
