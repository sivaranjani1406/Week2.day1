package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sivaranjani1406@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Lead List']/following::table[2]/tbody/tr/td/div/following::a[text()='Sivaranjani']"));
		
		String text = element.getText();
		
		System.out.println("Captured name "+text);
		
		element.click();
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String s1="Duplicate Lead | opentaps CRM";
		
		String title = driver.getTitle();
		
		if(s1.equals(title))
			System.out.println("Expected Title "+title +" Received Title "+s1);
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='First name']/following::span[1]"));
		
		String text2 = element2.getText();
		
		if(text2.equals(text))
		{
			System.out.println("Captured name is "+text2+" Received name is "+text);
		}
		
	driver.close();
	}

}
