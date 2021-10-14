package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");

		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Name and ID']/following::input[2]")).sendKeys("Sivaranjani");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Lead List']/following::table[2]/tbody/tr/td[1]/div/a"));
		
		
		String title = driver.getTitle();
		
		System.out.println("Title is "+title);
		
		findElement3.click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		
		String text2 = element2.getAttribute("value");
		
		System.out.println("Old company name "+text2);
		
		element2.clear();
		
		String s1="Wipro";
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(s1);
		
		driver.findElement(By.xpath("//span[text()='Important Note']/following::input[1]")).click();
		
		if(s1.equals(text2))
		{
		
        System.out.println("both are same"+s1+text2);
			
		}
		else
		{
			System.out.println("Updated company name is " +s1);
		}
	driver.close();
		
	}

}
