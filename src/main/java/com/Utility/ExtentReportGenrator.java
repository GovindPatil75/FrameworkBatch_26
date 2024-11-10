package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

    public static ExtentReports extent;
    
	public static ExtentReports getReports() {
		
		String ReportPath="C:\\Users\\Dell\\eclipse-workspace\\FrameworkBatch_26\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Test Report ");
		reporter.config().setReportName("Login Test Functionality");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Batch 26 ");
		extent.setSystemInfo("Module Name", "Login");
		extent.setSystemInfo("Selenium Version", "4.1.0");
		extent.setSystemInfo("O.S.", "Window 11");
		extent.setSystemInfo("BrowserName", "Chrome");
		extent.setSystemInfo("QA Name", "ABC");
		return extent;
		
		
	}
}
