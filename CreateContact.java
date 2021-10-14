package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");

		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("sivaranjani");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("manoharan");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Siva");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Testing purpose");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sivaranjani1406@gmail.com");
		driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")).sendKeys("Guam");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Important Note");
		
		driver.findElement(By.xpath("//span[text()='Important Note']/following::input[1]")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title of page "+title);

	}

}
