package second_web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SeagateHDD\\Studying Files\\QA Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String email = "omar.alajlouni7@gmail.com";
		String password = "1Booking_Password0";
		driver.get("http:\\booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("js-header-login-link")).click();
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.className("whxYYRnvyHGyGqxO4ici")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("new_password")).sendKeys(password);
		driver.findElement(By.name("confirmed_password")).sendKeys(password);
		driver.findElement(By.className("whxYYRnvyHGyGqxO4ici")).click();
		Thread.sleep(5000);
		WebElement book = driver.findElement(By.id("px-captcha")); 
		Actions actions = new Actions(driver);
		actions.moveToElement(book);
		actions.clickAndHold().build().perform(); 
	}
}