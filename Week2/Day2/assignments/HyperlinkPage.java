package week2.day2.assignments;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("((//div[@class ='row'])[1])//a")).click();
		driver.navigate().back();
		String link = driver.findElement(By.xpath("((//div[@class ='row'])[2])//a")).getAttribute("href");
		System.out.println("link redirects to: " + link);
		
		driver.findElement(By.xpath("((//div[@class ='row'])[3])//a")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String PageTitle = "HTTP Status 404 – Not Found";
		if (PageTitle.equals(title)) {
			System.out.println("Landed in broken page");
		}else {
			System.out.println("Not Landed in broken page");
		}
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("((//div[@class ='row'])[4])//a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("((//div[@class ='row'])[5])//a")).click();
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("No of hyperlinks is "+ size);
		
	}

}
