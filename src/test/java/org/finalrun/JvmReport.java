package org.finalrun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String json) {

		
		File f= new File("C:\\Users\\sachi\\eclipse-workspace\\Cucumber\\Reports\\Jvm");
		
		Configuration c = new Configuration(f, "Facebook Application");
		c.addClassifications("value 1", "java");
		c.addClassifications("value 2", "selenium");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
	}
	
}
