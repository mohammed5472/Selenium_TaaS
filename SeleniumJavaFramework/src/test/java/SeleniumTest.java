

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		//WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		//textbox.sendKeys("Automation");
		
		List<WebElement> ListOfElements = driver.findElements(By.xpath("//input"));
		
		int count = ListOfElements.size();
		
		System.out.println("Count of elemnets :"+count);
		
		
		
		driver.close();
		
	}

}
