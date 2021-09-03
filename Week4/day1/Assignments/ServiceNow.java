package week4.day1.assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://dev113545.service-now.com/");
System.out.println(driver.getTitle());
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.switchTo().frame("gsft_main");

driver.findElement(By.id("user_name")).sendKeys("admin");
driver.findElement(By.id("user_password")).sendKeys("w6hnF2FRhwLC");
driver.findElement(By.id("sysverb_login")).click();

Thread.sleep(2000);

driver.findElement(By.id("filter")).sendKeys("incident");
Thread.sleep(2000);

WebElement ele = driver.findElement(By.xpath("(//div[text()='All'])[2]"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", ele);
Thread.sleep(2000);
driver.switchTo().frame("gsft_main");
driver.findElement(By.id("sysverb_new")).click();
Thread.sleep(2000);
driver.findElement(By.id("lookup.incident.caller_id")).click();
Set<String> winHandsSet = driver.getWindowHandles();
List<String> winHandsList = new ArrayList<String>(winHandsSet);
driver.switchTo().window(winHandsList.get(1));
driver.findElement(By.xpath("//a[@class=\"glide_ref_item_link\"]")).click();
driver.switchTo().window(winHandsList.get(0));
driver.switchTo().frame("gsft_main");
driver.findElement(By.xpath("//input[@id=\"incident.short_description\"]")).sendKeys("Test");
String incidentNumber = driver.findElement(By.id("incident.number")).getAttribute("value");
System.out.println(incidentNumber);
driver.findElement(By.id("sysverb_insert")).click();
//driver.switchTo().frame("gsft_main");
driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys(incidentNumber, Keys.ENTER);
String createdIncidentNumber = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();

if(incidentNumber.equals(createdIncidentNumber)) {
	System.out.println("Incident created successfully");
} else {
	System.out.println("Incident not created");
}

driver.findElement(By.xpath("//a[@class='linked formlink']")).click();

File source = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
File dest = new File("./snaps/incident.png");
FileUtils.copyFile(source, dest);



	}

}
