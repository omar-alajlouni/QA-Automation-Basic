package swaglab_test;
import org.testng.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import dev.failsafe.internal.util.Assert;
public class HomePage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SeagateHDD\\Studying Files\\QA Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		String username = "standard_user";
		String password = "secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		String actual_title = driver.getTitle();
//		String expected_title = "Swag Labs";
//		Assert.assertEquals(actual_title, expected_title);
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
//		String cart_number_actual = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
//		String cart_number_expected = "7";
//		Assert.assertEquals(cart_number_actual, cart_number_expected);
		int expectedITems = 10;
		List<WebElement> myButtons = driver.findElements(By.className("btn"));
		for (int i = 0; i < myButtons.size(); i++) {
			myButtons.get(i).click();
		}
		String actualItemsAdded = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
		int theRealNumber = Integer.parseInt(actualItemsAdded);
		Assert.assertEquals(theRealNumber, expectedITems);
	}
}
