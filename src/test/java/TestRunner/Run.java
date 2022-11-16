package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
 
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Feature/LoginFeature.feature",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		 //plugin= {"pretty", "html:target/Cucumber-reports/report1.html"}
		
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class Run extends AbstractTestNGCucumberTests{

}
