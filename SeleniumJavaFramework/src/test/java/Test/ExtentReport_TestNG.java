package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport_TestNG {
	
	WebDriver driver;
	 
	ExtentHtmlReporter htmlReporter = null;
	ExtentReports extent = null;
	
	@BeforeTest
	public void Setup() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();

	}
	@Test
	public void test1() throws IOException {
		ExtentTest test = extent.createTest("Google Search Test one", "Verify Google Search");
		
		driver.get("https://google.com");
		test.pass("navigated to URL");
		
		test.log(Status.INFO, "Usage of Log(status, details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	
	
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("test completed");
	}
		

	
	@AfterSuite
	public void tearDwon() {
		extent.flush();

	}

}
