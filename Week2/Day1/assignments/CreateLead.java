package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webuser = driver.findElement(By.id("username"));
		webuser.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ACC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shree");
		
		WebElement sourceDrpDwn = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropSource = new Select(sourceDrpDwn);
		dropSource.selectByIndex(6);
		
		WebElement MarkDrpDwn = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropMark = new Select(MarkDrpDwn);
		dropMark.selectByValue("CATRQ_AUTOMOBILE");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kavi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Shree");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/14/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1M");
		
		WebElement PrefCurrDropDwn = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropPrefCurr = new Select(PrefCurrDropDwn);
		dropPrefCurr.selectByValue("ARA");
		
		WebElement IndustryDrpDwn = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropIndustry = new Select(IndustryDrpDwn);
		dropIndustry.selectByVisibleText("Computer Software");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		WebElement OwnershipDrpDwn = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropOwnership = new Select(OwnershipDrpDwn);
		dropOwnership.selectByIndex(2);
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Selenium Testing");
		
		WebElement Section1 = driver.findElement(By.id("createLeadForm_ _sp"));
		System.out.println(Section1.getText());
		
	    WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("5743658656");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Kavi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.test.com");
		
		WebElement Section2 = driver.findElement(By.id("createLeadForm__sp"));
		System.out.println(Section2.getText());
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Divs");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("abc street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("main");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Bloomington");
		
		WebElement StateDrpDwn = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropState = new Select(StateDrpDwn);
		dropState.selectByVisibleText("Illinois");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("10004");
		
		WebElement CountryDrpDwn = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropCountry = new Select(CountryDrpDwn);
		dropCountry.selectByVisibleText("United States");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("01");
		
		String firstname = driver.findElement(By.id("createLeadForm_firstNameLocal")).getAttribute("value");
		System.out.println("First name is " + firstname);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		String expectedpage = "View Lead | opentaps CRM";
		if (title2.equals(expectedpage)) {
			System.out.println("View Lead page is displayed successfully");
			
		} else {
			System.out.println("View Lead page is not displayed");
		}
		
		driver.close();
		
	}

}
