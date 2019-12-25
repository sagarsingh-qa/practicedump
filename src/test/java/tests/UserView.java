package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserView {

	@Test
	public void userview()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\eclipse-workspace\\practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin5.beta-wspbx.com");
		driver.findElement(By.xpath("")).sendKeys("security");
		driver.findElement(By.xpath("")).sendKeys("abc@12345");
		driver.findElement(By.xpath("")).submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@id='tab3']")).click();
		
		//table[@class ='nestedtable']/tbody/tr[1]/td[2]
		
		
		String beforeXpath = "";
		String afterXpath = "";
		
	}
	
}
