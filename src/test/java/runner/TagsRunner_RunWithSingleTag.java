package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/Tags.feature",
        glue = {"steps"},
        //tags = {"@smoke","@regression"} //depreciated
        //tags = "@smoke or @regression"
        //tags = "@smoke and @regression"
       // tags = {("@smoke or @regression) and @important"}
        //tags = {"@regression and not @smoke"}
        //tags = {(@smoke or @regression) and not @important"}
        tags = "@mustRun"
    )
class TagsRunner_RunWithSingleTag {
}
