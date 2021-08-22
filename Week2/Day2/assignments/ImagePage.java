package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("((//div[@class ='row'])[1])//img")).click();
		String title = driver.getTitle();
		String homePage = "TestLeaf - Selenium Playground";
		if (title.equals(homePage)) {
			System.out.println("Landed in Homepage");
		} else {
			System.out.println("Incorrect behaviour");
		}
		driver.navigate().back();
		
		driver.findElement(By.xpath("((//div[@class ='row'])[2])//img")).click();
		String title2 = driver.getTitle();
		System.out.println(title);
		String PageTitle = "TestLeaf - Interact with Images";
		if (PageTitle.equals(title2)) {
			System.out.println("Image is broken");
		}else {
			System.out.println("Image is perfect");
		}
	
		
		/*
		 * Actions action = new Actions(driver);
		 * 
		 * WebElement Element = driver.findElement(By.xpath("((//div[@class ='row'])[3])//img"));
		 * action.moveToElement(Element).click();
		 */
		/*
		 * String title3 = driver.getTitle(); if (title3.equals(homePage)) {
		 * System.out.println("Keyboard action successful"); } else {
		 * System.out.println("Keyboard action failed"); } driver.navigate().back();
		 */
	}

}
