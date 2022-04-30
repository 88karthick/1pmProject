package org.finalrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\filename3.txt", glue = "org.stepdefinition", dryRun = false, monochrome = true, strict = true, plugin = {
		"pretty", 
		"rerun:C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Rerun\\filename3.txt"

})

public class ReRunner {

	@AfterClass
	public static void report() {

		JvmReport.generateJvmReport("C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Reports\\Json\\fileName.json");
	}

}
