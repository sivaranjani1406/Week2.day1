package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");
		//enter email
		driver.findElement(By.xpath("//label[text()='Enter your email address']/following::input[1]")).sendKeys("sivaranjani@gmail.com");
		//Append text
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following::input[1]"));
		
		String Text1="text";
		
		findElement.sendKeys(Text1);
		
		//Get text
		
		WebElement findElement2 = driver.findElement(By.xpath("//label[text()='Get default text entered']/following::input[1]"));
		
		String text = findElement2.getText();
		
		System.out.println("Default text "+text);
		//clear text
		driver.findElement(By.xpath("//label[text()='Clear the text']/following::input[1]")).clear();
		//Button enabled or disabled
		WebElement findElement3 = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input[1]"));
		boolean enabled = findElement3.isEnabled();
		System.out.println(enabled);
		
	}

}
