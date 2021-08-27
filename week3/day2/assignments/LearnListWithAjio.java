package week3.day2.assignments;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListWithAjio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// close the popup
//driver.findElement(By.xpath("//div[@class='ic-close-quickview']")).click();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"))
				.sendKeys("Bags", Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		Thread.sleep(3000);
		String NoOfBags = driver.findElement(By.xpath("//div[@class='length']")).getText();
		String[] NoOfBagsSplit = NoOfBags.split(" ");
		System.out.println(NoOfBagsSplit[0]);
//Getting the list of brands
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<String> bagBrands = new HashSet<String>();
		System.out.println("List of Bag Brands");
		for (WebElement eachelement : findElements) {
			boolean status = bagBrands.add(eachelement.getText());
			if (status == true) {
				System.out.print(eachelement.getText() + ", ");
			}
		}

//Getting the list of bag names
		List<WebElement> findElements1 = driver.findElements(By.xpath("//div[@class='name']"));
		Set<String> bagNames = new HashSet<String>();
		System.out.println("\nList of Bag names");
		for (WebElement eachelement1 : findElements1) {
			boolean status2 = bagNames.add(eachelement1.getText());
			if (status2 == true) {
				System.out.print(eachelement1.getText() + ", ");
			}

		}

		driver.close();
	}

}
