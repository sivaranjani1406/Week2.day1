package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundlink {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.navigate().to("http://leafground.com/pages/Link.html");

		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		System.out.println(driver.findElement(By.partialLinkText("Find where")).getAttribute("href"));
		
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		
		if(driver.getTitle().contains("404"))
		{
			System.out.println("Page is broken");
		}
		
		driver.navigate().back();
		
		
	}

}
