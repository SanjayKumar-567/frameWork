package listnerimplimentation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseclass.BaClass;
import genaricutility.JavaUtility;

public class ListenerClass implements ISuiteListener, ITestListener {

	public static ExtentReports report;// public is used to access test method other packages
	public static ExtentTest test;// static is used to access screenshoets
	JavaUtility javaUtility = new JavaUtility();

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		report = new ExtentReports(
				"./AdvancedReport/report.html" + suite.getName() + javaUtility.getSystemDateWithTime() + ".html");
		Reporter.log(suite.getName() + " has Started", true);
	}


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = report.startTest("LoginTest");
		test.log(LogStatus.INFO, result.getName() + " is Started ");
		

		Reporter.log(result.getName() + " is Started ", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.SKIP, result.getName() + " has Skipped ");

		Reporter.log(result.getName() + " has Skipped ", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName() + " is succesfully executed", true);
		// TODO Auto-generated method stub
		test.log(LogStatus.INFO, result.getName() + "is succesfully executed");

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String screenShortPath = ("./FailedScreenShorts/" + result.getName() + javaUtility.getSystemDateWithTime()
				+ ".png");
		File path = new File(screenShortPath);
		TakesScreenshot ts = (TakesScreenshot) BaClass.sdriver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log(result.getName() + " is Failed and Captured Succesfully ", true);
		test.log(LogStatus.INFO, test.addScreenCapture("." + screenShortPath));

		test.log(LogStatus.FAIL, result.getName() + "has failed and sucussfully captured screenshort");

	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub

		report.endTest(test);
		report.flush();
		Reporter.log(suite.getName() + " has Finished", true);
	}
}
