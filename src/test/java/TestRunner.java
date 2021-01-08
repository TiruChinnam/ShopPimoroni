import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(

        features = {"src/test/java/features/"},
        plugin = {"pretty","html:target/report.html"},
        tags = "@register",
        publish = true
//        tags = "@regression or @ui ~@search"

        //tags = "@login and search"




)



@RunWith(Cucumber.class)
public class TestRunner
{

}
