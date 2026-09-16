package seleniumWebDriverRadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtons {

    @Test
    public void TestRadioBtn() throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//label[@for='male']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='female']")).click();
        Thread.sleep(1000);

        driver.quit();
    }
}