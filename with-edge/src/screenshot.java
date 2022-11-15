import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.testng.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.domstorage.model.Item;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"D:\\SeagateHDD\\Studying Files\\QA Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		List<WebElement> thestudents = driver.findElements(By.tagName("option"));
		int theTotalNumberOfStudents = thestudents.size();
		System.out.println(theTotalNumberOfStudents + " this is the orginal number");
		int HowManyItems = 8;
		System.out.println(HowManyItems + " this is the number of items i want remove");
		// WebElement options = thestudents.get(theTotalNumberOfStudents);
//		int i = 0;
//		int index = thestudents.indexOf(i);
//		for (i=0; i < HowManyItems; i++) {
//			if(index%2==0) {
//				System.out.println(index);
//				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
//				thestudents.get(i).click();
//			}
//		}
		for (int i = 0; i < thestudents.size(); i++) {
			if (i % 2 != 0) {
				thestudents.get(i).click();
				System.err.println(thestudents.get(i).getText() + " sorry bye bye");
				driver.findElement(By.id("remove")).click();
			} else {
				System.out.println("i will keep " + thestudents.get(i).getText());
			}
		}
		List<WebElement> thestudentsAfterRemove = driver.findElements(By.tagName("option"));
		int ActualNumber = thestudentsAfterRemove.size();
		System.out.println(ActualNumber + " this is the new actaual number");
		int expectedITems = theTotalNumberOfStudents - HowManyItems;
		System.out.println(expectedITems + " this is the number i have expected");
		Assert.assertEquals(ActualNumber, expectedITems);
//		Thread.sleep(3000);
//		Date currentDate = new Date();
//		String TheAcutalDate = currentDate.toString().replace(":", "-");
//		TakesScreenshot src = ((TakesScreenshot) driver);
//		File SrcFile = src.getScreenshotAs((OutputType.FILE));
//		File Dest = new File(".//mypictures/" + TheAcutalDate + ".png");
//		FileUtils.copyFile(SrcFile, Dest);
	}
}