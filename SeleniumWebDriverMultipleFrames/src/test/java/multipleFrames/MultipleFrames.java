package multipleFrames;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class MultipleFrames {

	@Test
	public void Frames() throws Exception {
		String iframeUrl = "file://" + new File("src/test/resources/iframe.html").getAbsolutePath();
		WebDriver driver = Helper.startBrowser("GC");
		driver.get(iframeUrl);
		Thread.sleep(2000);
	
		int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames: " + totalnoofframes);

		driver.switchTo().frame("easycalculation");

		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");

		driver.findElement(By.id("log_email")).sendKeys("8019962379");
		driver.findElement(By.id("log_password")).sendKeys("Dikshith");

		driver.findElement(By.xpath("//input[contains(@name,'log_submit')]")).click();

		String title = driver.getTitle();
		System.out.println(title);
	
		driver.navigate().to(iframeUrl);
	
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html/body/a")).click();
	
		driver.navigate().to("https://www.selenium.dev/");
	
		Thread.sleep(2000);
	
		String title1 = driver.getTitle();
		System.out.println(title1);
	
		driver.navigate().to(iframeUrl);
	
		driver.switchTo().frame("My Store");
	
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	
		driver.findElement(By.id("username")).sendKeys("student"); 
		driver.findElement(By.id("password")).sendKeys("Password123");
	
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	
		String title2 = driver.getTitle();
		System.out.println(title2);
	
		Thread.sleep(2000);
	
		driver.quit();

	}
}