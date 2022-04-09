package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {

	public static ExtentReports extent;
	public static ExtentReports getReports()
	{
		String reportLocation=System.getProperty("user.dir")+"\\reports\\ProjectReports.html";
		ExtentSparkReporter esr=new ExtentSparkReporter(reportLocation);
		esr.config().setDocumentTitle("Automation Testing");
		esr.config().setReportName("Login Functionality");
		
		 extent=new ExtentReports();
		extent.attachReporter(esr);
		extent.setSystemInfo("Tester", "Akshay Deshmukh");
		return extent;
	}
}
