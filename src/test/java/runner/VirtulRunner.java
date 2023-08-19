package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:/Users/AA/eclipse-workspace/UdemyProject/src/test/resources/Features/Product.feature",
		glue="cucumber",
		monochrome=true,
		plugin= {"html:target/cucumber.html"})
public class VirtulRunner {

	

}
