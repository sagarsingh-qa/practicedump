package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PdfDownload {
	public WebDriver driver = null;

	@BeforeTest
	public void Browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sagar\\eclipse-workspace\\practice\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void download() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://admin5.beta-wspbx.com/");
		driver.findElement(By.name("xusername")).sendKeys("security");
		driver.findElement(By.name("password")).sendKeys("abc@12345");
		driver.findElement(By.className("normalButton")).click();

		driver.findElement(By.xpath("//li[@id='tab3']")).click();

		String GetText = driver.findElement(By.xpath("//span[@id='tempdiv_module_header']")).getText();
		Assert.assertEquals(GetText, "User View");
	    System.out.println("You are in User View");
	    
	    String ID;
	    String FirstName;
	    String LastName;
	    int extension;
	    int row;
	    
	    
	    List<WebElement> listOfCheckbox = driver.findElements(By.xpath("//table[@class='nestedtable']/tbody/tr/td[@class='checkboxCol']"));
	    System.out.println("No of checkboxes in each page::::"+listOfCheckbox.size());
	    
	    listOfCheckbox.get(0).click();
	    
	    List<WebElement> firstName = driver.findElements(By.xpath("//table[@class='nestedtable']/tbody/tr/td[3]"));
	    
	    firstName.get(0).click();
	    
		/*
		 * try { driver.wait(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	    
		/*
		 * for(int i=0;i<listOfCheckbox.size();i++) { listOfCheckbox.get(i).click(); }
		 */
	    
	    
	    
	    
	    
		driver.close();
	}
}
