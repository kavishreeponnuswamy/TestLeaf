package week4.day1.assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotOfElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);

		WebElement findElement = driver.findElement(By.id("Click"));

		File source = findElement.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/click.png");
		FileUtils.copyFile(source, dest);
		driver.switchTo().parentFrame();
		
		List<WebElement> frameElements = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames: "+frameElements.size());
		
		driver.close();
		
		
	}

}
