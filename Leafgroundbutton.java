package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundbutton {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/Button.html");
		
		//Click button to travel home page
		
		driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following::button[1]")).click();
		
		System.out.println("Click action performed");
		
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		//Find position of button (x,y)
		
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following::button[2]"));
		
		Point location = findElement.getLocation();
		
		System.out.println("position is "+location);
		
		//WebElement findElement2 = driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following::button[3]"));
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following::button[3]")).getCssValue("background-color"));
		
		//System.out.println("Color is "+cssValue);
		
		WebElement findElement3 = driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following::button[4]"));
		
		Dimension size2 = findElement3.getSize();
		
		System.out.println("Size is "+size2);
		
		
		
		
		
		
		
	}

}
