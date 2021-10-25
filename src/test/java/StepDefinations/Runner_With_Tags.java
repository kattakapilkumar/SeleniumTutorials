package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags/Tags.feature",
  glue= {"StepDefinations"},
  tags = "(@smoke or @regression) and @important"
		)
public class Runner_With_Tags {

}
