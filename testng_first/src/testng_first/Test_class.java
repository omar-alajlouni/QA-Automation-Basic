package testng_first;
import org.asynchttpclient.webdav.WebDavCompletionHandlerBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test_class {
	public WebDriver driver1;
	public WebDriver driver2;
	@BeforeTest
	public void login() {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//driver1 = new ChromeDriver();
		driver2 = new EdgeDriver();
		//driver1.get("http://google.com");
		driver2.get("http://google.com");
	}
	@Test()
	public void The_titleTest() {
		
	}
}