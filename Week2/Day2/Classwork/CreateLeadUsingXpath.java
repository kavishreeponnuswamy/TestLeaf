package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Locator as Xpath
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoCSR");
		
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ACC");
		driver.findElementByXPath("//span[text()='Company Name']").getText();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").getAttribute("value");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Kavi");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Kavi");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	}

}
