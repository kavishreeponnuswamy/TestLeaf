package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		
		Point position = driver.findElement(By.id("position")).getLocation();
		System.out.println("Position of the button is " + position);
		
		String colour = driver.findElement(By.id("color")).getAttribute("style");
		System.out.println("Colour of the button is: "+colour);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("Size of the button is: "+size);
	}

}
