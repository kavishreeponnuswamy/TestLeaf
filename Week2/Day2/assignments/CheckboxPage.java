package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//label[text()='Select the languages that you know?'])//following::input")).click();
		boolean selected = driver.findElement(By.xpath("(//label[text()='Confirm Selenium is checked'])//following::input")).isSelected();
		if (selected == true) {
			System.out.println("Option is selected");
		} else {
			System.out.println("Option is not selected");
		}
		WebElement element1 = driver.findElement(By.xpath("((//label[text()='DeSelect only checked'])//following::input)[1]"));
		boolean selected2 = element1.isSelected();
		System.out.println(selected2);
		WebElement element2 = driver.findElement(By.xpath("((//label[text()='DeSelect only checked'])//following::input)[2]"));
		boolean selected3 = element2.isSelected();
		System.out.println(selected3);
		
		if(selected2 == true) {
			element1.click();
			System.out.println("Element is deselected");
		} else if(selected3 == true) {
			element2.click();
			System.out.println("Element is deselected");
		}

		driver.findElement(By.xpath("((//label[text()='Select all below checkboxes '])//following::input)[1]")).click();
		driver.findElement(By.xpath("((//label[text()='Select all below checkboxes '])//following::input)[2]")).click();
		driver.findElement(By.xpath("((//label[text()='Select all below checkboxes '])//following::input)[3]")).click();
		driver.findElement(By.xpath("((//label[text()='Select all below checkboxes '])//following::input)[4]")).click();
		driver.findElement(By.xpath("((//label[text()='Select all below checkboxes '])//following::input)[5]")).click();
	}

}
