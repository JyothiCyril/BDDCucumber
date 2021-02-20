package com.qa.TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "D:\\SeleniumTraining\\BDDCucumber\\src\\test\\java\\com\\qa\\Features\\Amazon.feature",
		glue="com.qa.StepDefinition",
		dryRun = false,
		strict = true,
		monochrome = true,
		format = {"pretty" , "html:test-output"}
		)





public class Amazon_TestRunner {

}
