package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test one", "Verify Google Search");
		
		WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "starting Test Case");
		driver.get("http://google.com");
		test1.pass("Nav to site");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("entered text");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Hit enter key");
		
		driver.close();
		test1.pass("closed browser");
		test1.info("Test Completed");
		
		extent.flush();
		
		
		
		
	}
	

}
