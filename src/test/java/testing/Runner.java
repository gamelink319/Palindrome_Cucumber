package testing;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
				features = "src/test/resources/feature/palindrom.feature",
				glue ="testing",
				plugin={"pretty","html:target/cucumber-reports.html"})

public class Runner extends AbstractTestNGCucumberTests {

}