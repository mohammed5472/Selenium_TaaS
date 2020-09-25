package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
		
	}

	@Test
	public void GoogleSearch2() {
		
		driver.get("http://google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Test Automation");

		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		

		
	}
	@AfterTest
	public void tearaDown() {
		
		driver.close();
		
		System.out.println("test complete");
		
		
	}
	
}
