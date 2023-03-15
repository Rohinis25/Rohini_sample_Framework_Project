import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/features",
        glue=".",
      tags="@login5",
       // tags="@Run or @mustRun or @All"
       plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json"}
)
public class CucumberRunner {
}
