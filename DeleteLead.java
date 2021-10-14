package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9629579722");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Lead ID']/following::div/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a[1]"));
		
		String text2 = ele.getText();
		
		System.out.println("Text2 is "+text2);
		
		String text = ele.getAttribute("class");
		
		System.out.println("Text is "+text);
		
		ele.click();
		
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text2);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text3= "No records to display";
		WebElement findElement3 = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text4 = findElement3.getText();
		
		if(text4.equals(text3))
	
			System.out.println("Deletion of record is success");
		
		driver.close();
		
		
	}

}
