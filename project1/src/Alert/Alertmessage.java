package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alertmessage {
	ChromeDriver driver;
	@BeforeTest 
	public void openit(){
		 driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web");
	}
	@Test
	public void check() throws InterruptedException{
		driver.findElement(By.id("searchBtn")).click();
		String names = driver.switchTo().alert().getText();
		Thread.sleep(30000);
		driver.switchTo().alert().dismiss();
	
	}
}
