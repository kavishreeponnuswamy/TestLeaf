package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
			
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']//following::img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>();
		for (String eachWebElement : windowHandles) {
			windowHandlesList.add(eachWebElement);
		}
		driver.switchTo().window(windowHandlesList.get(1));
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']//following::img")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowHandlesList2 = new ArrayList<String>();
		for (String eachWebElement2 : windowHandles2) {
			windowHandlesList2.add(eachWebElement2);
		}
		driver.switchTo().window(windowHandlesList2.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		String title2 = driver.getTitle();
		if(title2.equals("View Contact | opentaps CRM")) {
			System.out.println("Page title is: " + title2);	
		}else {
			System.out.println("Navigated to wrong page");
		}
		
		}

}

