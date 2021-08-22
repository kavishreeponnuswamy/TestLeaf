package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("Kavi");
		WebElement append = driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input"));
		/*
		 * String defaultText = append.getAttribute("value"); defaultText =
		 * defaultText+"Kavi";
		 */
		append.sendKeys("Kavi", Keys.TAB);
		String defaultText = driver.findElement(By.xpath("((//div[@class ='row'])[3])//input")).getAttribute("value");
		System.out.println("Default text is " + defaultText );
		
		driver.findElement(By.xpath("((//div[@class ='row'])[4])//input")).clear();
		
		boolean enabled = driver.findElement(By.xpath("((//div[@class ='row'])[5])//input")).isEnabled();
		System.out.println("Field is enabled: " + enabled);
		
	}

}
