package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		GoogleSearchTest();
		
		
	}
	public static void GoogleSearchTest() {
		
		WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		searchPageObj.setTextinSearchBox("ABCD");
		searchPageObj.clickSearchButton();
		
		
			
			
		}
	
}

