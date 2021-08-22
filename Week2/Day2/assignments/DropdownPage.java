package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(element1);
		drop1.selectByIndex(1);
		
		WebElement element2 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(element2);
		drop2.selectByVisibleText("Selenium");
		
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(element3);
		drop3.selectByValue("1");
		
		WebElement element = driver.findElement(By.className("dropdown"));
		Select drop = new Select(element);
		int size = drop.getOptions().size();
		System.out.println("No of dropdown options is "+ size);
		
		driver.findElement(By.xpath("((//div[@class='example'])[5])/select")).sendKeys("Selenium");
		
		WebElement element5 = driver.findElement(By.xpath("((//div[@class='example'])[6])//select"));
		Select drop5 = new Select(element5);
		drop5.selectByValue("1");
		drop.selectByValue("2");
		//List<WebElement> options = drop5.getOptions();
		
		
	}
	

}
