package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("yes")).click();
		boolean unchecked = driver.findElement(By.xpath("(//label[text()='Find default selected radio button'])//following::input")).isSelected();
		boolean checked = driver.findElement(By.xpath("((//label[text()='Find default selected radio button'])//following::input)[2]")).isSelected();
		if (checked == true) {
			System.out.println("Checked radio button is selected");
		} else if (unchecked == true) {
			System.out.println("Unchecked radio button is selected");
		}
		
		boolean option1 = driver.findElement(By.xpath("(((//div[@class='row'])[3])//input)[1]")).isSelected();
		boolean option2 = driver.findElement(By.xpath("(((//div[@class='row'])[3])//input)[2]")).isSelected();
		boolean option3 = driver.findElement(By.xpath("(((//div[@class='row'])[3])//input)[3]")).isSelected();
		
		if(option1||option2||option3 == true) {
			System.out.println("Option is selected");
		} else {
			System.out.println("No option is selected");
		}
	}

}
