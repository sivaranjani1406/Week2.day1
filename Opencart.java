package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =  new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("input-username")).sendKeys("Sivaranjani");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Siva");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Ranjani");
		
		driver.findElement(By.id("input-email")).sendKeys("Sivaranjani@gmail.com");
		
		driver.findElement(By.id("input-country")).sendKeys("India");
		
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		
		driver.close();
		

	}

}
