package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Kavishree");
		driver.findElement(By.name("UserLastName")).sendKeys("Kavi");
		driver.findElement(By.name("UserEmail")).sendKeys("kavi@gmail.com");
		driver.findElement(By.name("UserPhone")).sendKeys("9876543678");
		
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select Titleoption = new Select(jobtitle);
		Titleoption.selectByIndex(1);
		
		WebElement CompanyEmployees = driver.findElement(By.name("CompanyEmployees"));
		Select employee = new Select(CompanyEmployees);
		employee.selectByValue("75");
		
		WebElement CompanyCountry = driver.findElement(By.name("CompanyCountry"));
		Select country = new Select(CompanyCountry);
		country.selectByVisibleText("India");
		
		
		driver.findElement(By.xpath("(//div[@class ='checkbox-ui'])[1]")).click();
		driver.close();
		
		
	}

}
