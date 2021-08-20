package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load an URL - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Get page title
		String title = driver.getTitle();
		System.out.println(title);

		// Maximize the window
		driver.manage().window().maximize();

		// implicit wait --> waits for the given time each time it finds a findElement
		// method, else this gives NoSuchElementException
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElementsById("username"); --> Might not be used in upcoming
		// versions
		// driver.findElement(By.id("password"));

		// Locate the Web elements - Username and enter demosalesmanager
		WebElement webuser = driver.findElement(By.id("username"));
		webuser.sendKeys("demosalesmanager");

		// Locate the Web elements - Password and enter crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Locate the Login button and click on it
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Verify is the landing page is correct
		String homeTitle = "My Home | opentaps CRM";
		String title2 = driver.getTitle();
		if (homeTitle.equals(title2)) {
			System.out.println("In the homepage");
			
		}
		
		
		

		// Close the window
		// driver.close();
	}

}
