package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement srcele = driver.findElement(By.xpath("//input[@id='src']"));
		srcele.sendKeys("Chennai");
		Thread.sleep(3000);
		srcele.sendKeys(Keys.ENTER);
		WebElement destele = driver.findElement(By.xpath("//input[@id='dest']"));
		destele.sendKeys("Bengaluru");
		Thread.sleep(3000);
		destele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[text()='22']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='close']/i")).click();
		Thread.sleep(5000);
		String busCount1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of search results " + busCount1);
		driver.findElement(By.xpath("//div[@class='close-primo']/i")).click();
		Thread.sleep(5000);
		
		//select only sleeper bus
		WebElement sleeper = driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label"));
		driver.executeScript("arguments[0].scrollIntoView();", sleeper);
		Thread.sleep(8000);
		sleeper.click();
		Thread.sleep(8000);
		String busCount2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of search results " + busCount2);
		//Deselect sleeper bus
		sleeper.click();
		Thread.sleep(8000);
		//Select AC bus
		driver.findElement(By.xpath("(//ul[@class='list-chkbox']//label)[6]")).click();
		Thread.sleep(2000);
		String busCount3 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of search results " + busCount3);
		//select non AC bus also
		driver.findElement(By.xpath("(//ul[@class='list-chkbox']//label)[8]")).click();
		Thread.sleep(2000);
		String busCount4 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of search results " + busCount4);

	}

}
