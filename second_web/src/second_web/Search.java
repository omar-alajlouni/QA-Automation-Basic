package second_web;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Keep;
public class Search {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SeagateHDD\\Studying Files\\QA Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("ss")).sendKeys("amman"+Keys.ARROW_DOWN+Keys.ENTER);
		//Keys searchKeys = Keys.ARROW_DOWN;
		
		Thread.sleep(3000); // click search
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div[4]/button")).click();
	}
}