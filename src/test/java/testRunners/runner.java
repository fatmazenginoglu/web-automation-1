package testRunners;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions","util"},
        tags = "",
        plugin = {"summary","pretty","html:Reports/CucumberReport/Reports.html"}
)

public class runner extends AbstractTestNGCucumberTests {
    //static WebDriver driver= DriverFactory.getDriver();

}
