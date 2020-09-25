import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("httsp://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		
	}

}
