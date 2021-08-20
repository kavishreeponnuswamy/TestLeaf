package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kavitha");
		driver.findElement(By.name("lastname")).sendKeys("Test");
		driver.findElement(By.name("reg_email__")).sendKeys("9994070043");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Finalct1");
		WebElement drpdwn1 = driver.findElement(By.name("birthday_day"));
		Select day = new Select(drpdwn1);
		day.selectByValue("1");
		
		WebElement drpdwn2 = driver.findElement(By.name("birthday_month"));
		Select Month = new Select(drpdwn2);
		Month.selectByVisibleText("Jan");
		
		WebElement drpdwn3 = driver.findElement(By.name("birthday_year"));
		Select year = new Select(drpdwn3);
		year.selectByIndex(7);
		
		/*
		 * driver.findElement(By.name("birthday_month")).sendKeys("Jan");
		 * driver.findElement(By.name("birthday_year")).sendKeys("2000");
		 */
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.name("websubmit")).click();
		System.out.println("signed in");
	}

}
