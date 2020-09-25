package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.ProperitesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName=null;
	
	
	@BeforeTest
	public void setUpTest() {
		ProperitesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		
		
	}

	@Test
	public void GoogleSearch() {
	
		
		driver.get("http://google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Automation Step by Step");

		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		

		
	}
	@AfterTest
	public void tearaDown() {
		
		driver.close();
		
		System.out.println("test complete");
		ProperitesFile.setProperties();
		
		
	}
	
}
