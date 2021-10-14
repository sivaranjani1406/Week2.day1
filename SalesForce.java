package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Siva");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Ranjani");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("sivaranjani@gmail.com");
		driver.findElement(By.xpath("//select[@name='UserTitle']")).sendKeys("Sales Manager");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//select[@name='CompanyEmployees']")).sendKeys("1 - 15 employees");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9876789098");
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following::div[1]")).click();
		
		

	}

}
