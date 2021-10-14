package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Daksha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Aditi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6765456786");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Daksha@123");
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(element1);
		sel.selectByIndex(3);
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select sel1=new Select(element2);
		sel1.selectByIndex(3);
		
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select sel2=new Select(element3);
		sel2.selectByValue("1992");
		
		driver.findElement(By.xpath("//label[text()='Female']/following::input[1]")).click();
		
		driver.close();
		
	

	}

}
