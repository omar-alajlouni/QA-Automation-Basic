package qa_first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SeagateHDD\\Studying Files\\QA Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/github/Qa-Automation-private-first-project/index.html");
		
		//driver.get("http:\\www.google.com");
		//driver.get("http:\\www.facebook.com");
		//driver.navigate().back();
		
		driver.findElement(By.id("email-input")).sendKeys("omar@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("PAss");
		driver.findElement(By.id("date-input")).sendKeys("06-16-1910");
		driver.findElement(By.id("mobile-input")).sendKeys("0798800997");
		driver.findElement(By.tagName("button")).click();
	}
}