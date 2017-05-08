package common;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by lyguo on 07/05/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/feature/"},
        format = {"pretty","html:target/cucumber","json:target/cucumber.json"},
        glue = {"stepDefinations"}

)
public class RunCukesTest_IOS {
}
