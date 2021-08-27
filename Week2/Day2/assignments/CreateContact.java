package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.get("https://google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			
		//WebElement findElement = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Test");
		driver.findElement(By.id("lastNameField")).sendKeys("Name1");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("LocalTest");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LocalLeaf");
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Tester");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("08/20/2021");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("QA Lead");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createContactForm_preferredCurrencyUomId")).sendKeys("Indian Rupee");
		
		driver.findElement(By.id("createContactForm_accountPartyId")).sendKeys("A0Test1");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Contact1");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("Test Purpose");
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("004");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("8765438954");
		driver.findElement(By.id("createContactForm_primaryPhoneExtension")).sendKeys("1234");
		driver.findElement(By.id("createContactForm_primaryPhoneAskForName")).sendKeys("Test1");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Test1@gmail.com");
		driver.findElement(By.id("generalToNameField")).sendKeys("Test1");
		driver.findElement(By.id("createContactForm_generalAttnName")).sendKeys("Test1");
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("Test1 Add");
		driver.findElement(By.id("createContactForm_generalAddress2")).sendKeys("Test1 Add2");
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Test1");
		
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("India");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		
		driver.findElement(By.id("createContactForm_generalCountryGeoId")).sendKeys("2334");
		driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("025");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(1000);
		String str1 = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("Contact created successfully with ID : "+str1);
		
				
		}

	}

}


