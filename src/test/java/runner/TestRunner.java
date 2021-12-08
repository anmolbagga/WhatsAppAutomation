package runner;

import com.vox.test.whatsapp.BaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/resources/features/WhatsappFeature.feature"
,glue= {"steps"}
,plugin= {"pretty","html:target/cucumber-html-report.html"})
public class TestRunner extends BaseTest {
}