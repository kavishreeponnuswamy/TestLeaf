package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String toupdatename = "New Company Name";
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("catt");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String ID= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(toupdatename);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String newText = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		toupdatename=toupdatename+" ("+ID+")";
		
		System.out.println("Company name to Update: " + toupdatename);
		System.out.println("Updated Company name : " + newText);
		
		if(newText.equals(toupdatename))
			System.out.println("Company name is updated sucessfully");
		else
			System.out.println("Company name updation is unsucessful");
		driver.close();
		
		}
	}

}
