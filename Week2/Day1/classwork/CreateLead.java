package week2.day1;

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
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");
		//driver.findElement(By.className("smallSubmit")).click();
		
		WebElement sourceDrpDwn = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropSource = new Select(sourceDrpDwn);
		dropSource.selectByIndex(6);
		int sourceSize = dropSource.getOptions().size();
		System.out.println("Source dropdown is of size " +sourceSize);
		
		WebElement MarkDrpDwn = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropMark = new Select(MarkDrpDwn);
		dropMark.selectByValue("CATRQ_AUTOMOBILE");
		int MarkSize = dropMark.getOptions().size();
		System.out.println("Marketing Campaign dropdown is of size " +MarkSize);
		
		WebElement IndustryDrpDwn = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropIndustry = new Select(IndustryDrpDwn);
		dropIndustry.selectByVisibleText("Computer Software");
		int IndustrySize = dropIndustry.getOptions().size();
		System.out.println("Industry dropdown is of size " +IndustrySize);
		
		
	

		// Close the window
		// driver.close();
	}

}


