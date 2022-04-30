package org.finalrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile"
,glue="org.stepdefinition",dryRun=false,monochrome=true,strict=true,plugin= {"pretty",
"html:C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Reports\\HTML",
"json:C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Reports\\Json\\fileName.json",
"junit:C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Reports\\Junit\\filename2.xml",
"rerun:C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Rerun\\filename3.txt"
		

})

public class RunAll {

	@AfterClass
	public static void report() {

		JvmReport.generateJvmReport("C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Reports\\Json\\fileName.json");
	}
	
}
