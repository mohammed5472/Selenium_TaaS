package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {
	public static void main(String[] args)  {
		
		GoogleSearch();
		
	}

	
	public static void GoogleSearch() {
		
		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Automation Step by Step");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("test complete");
		
	}
}
