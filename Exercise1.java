package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");

		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		WebElement cmpyname, fname, lname, fnamelocal, lnamelocal, salutation, dob, title, dept, revenue, empcount,
				siccode, ticksym, desc, imp, countrycode, areacode, phn, extn,email,per,attname,url,toname,
				addr1,addr2,city,postcode,codeextn,testname;

		String firstname="Sivaranjani";
		cmpyname = driver.findElement(By.id("createLeadForm_companyName"));
		cmpyname.sendKeys("TestLeaf");

		fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys(firstname);
		System.out.println("First Name is "+firstname);

		lname = driver.findElement(By.id("createLeadForm_lastName"));
		lname.sendKeys("Manoharan");
		
		Thread.sleep(2000);

		fnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fnamelocal.sendKeys("Shiva");

		lnamelocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lnamelocal.sendKeys("M");

		salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("Testsalutation");

		dob = driver.findElement(By.id("createLeadForm_birthDate"));
		dob.sendKeys("6/7/92");

		title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title.sendKeys("Mrs");

		dept = driver.findElement(By.id("createLeadForm_departmentName"));
		dept.sendKeys("Testing");

		revenue = driver.findElement(By.id("createLeadForm_annualRevenue"));
		revenue.sendKeys("400000");

		empcount = driver.findElement(By.id("createLeadForm_numberEmployees"));
		empcount.sendKeys("2000");

		siccode = driver.findElement(By.id("createLeadForm_sicCode"));
		siccode.sendKeys("001");

		ticksym = driver.findElement(By.id("createLeadForm_tickerSymbol"));
		ticksym.sendKeys("yes");

		desc = driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("description");

		imp = driver.findElement(By.id("createLeadForm_importantNote"));
		imp.sendKeys("Note");

		//contact Information
		countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("1");

		areacode = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		areacode.sendKeys("636003");

		phn = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phn.sendKeys("9629579722");

		extn = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		extn.sendKeys("+91");
		
		per=driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		per.sendKeys("Personname");
		
		email=driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("sivaranjani1406@gmail.com");
		
		url=driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		url.sendKeys("www.test.com");
		
		//primary Address
		toname=driver.findElement(By.id("createLeadForm_generalToName"));
		toname.sendKeys("Daksha");
		
		attname=driver.findElement(By.id("createLeadForm_generalAttnName"));
		attname.sendKeys("Aditi");
		
		addr1= driver.findElement(By.id("createLeadForm_generalAddress1"));
		addr1.sendKeys("BBC colony");
		
		addr2= driver.findElement(By.id("createLeadForm_generalAddress2"));
		addr2.sendKeys("Street");
		
		city= driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("coimbatore");
		
		Select sel=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		sel.selectByVisibleText("Arizona");
		
		postcode=driver.findElement(By.id("createLeadForm_generalPostalCode"));
		postcode.sendKeys("641029");
		
		codeextn=driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		codeextn.sendKeys("001");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		Thread.sleep(4000);
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		System.out.println("Verified Name in view Lead screen is "+text);
		
		System.out.println("Title of screen "+driver.getTitle());

		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(2000);

		driver.close();
		Thread.sleep(2000);
	}

}
