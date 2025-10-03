package project.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/InventoryTest.feature",
        glue = "project.bdd.steps",
        tags = "@inventory",
        dryRun = false
)
public class Test {

}
