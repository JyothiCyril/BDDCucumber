package com.qa.TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "D:\\SeleniumTraining\\BDDCucumber\\src\\test\\java\\com\\qa\\Features\\Rediff.feature",
		glue="com.qa.StepDefinition",
		dryRun = false,
		strict = true,
		monochrome = true,
		format = {"pretty" , "html:test-output"},
		tags= {"@SmokeTest", "@UsabilityTest , @RegressionalTest" }
		)

// {"~@SmokeTest"}
// {"@SmokeTest"}
// {"@SmokeTest, @UsabilityTest"} --> either or 
// {"@SmokeTest", "@UsabilityTest"} --> Anding

public class Rediff_TestRunner {

}
