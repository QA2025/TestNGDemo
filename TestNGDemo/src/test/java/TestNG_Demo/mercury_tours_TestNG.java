package TestNG_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mercury_tours_TestNG {
		
public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest(groups ="smoke test")
	public void launchmercury(){		
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@Test(priority=1, groups ="smoke test")
	public void locatingWebelement() {
		
		WebElement username= driver.findElement(By.xpath("//*[@name='userName']"));
		WebElement password= driver.findElement(By.cssSelector("input[name='password']"));
		WebElement submit= driver.findElement(By.name("submit"));
		
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("mercury");
		
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("mercury");
		
		Assert.assertTrue(submit.isDisplayed());
		submit.click();
		
		/*
		 Assert.assertFalse(submit.isDisplayed());
		 submit.click();
		 */
	}
	
	@Test(priority=2, groups={"smoke test","functional Test"})
	
	public void LoginSuccesseful() {
		
		String expectedpagetitle = "Login: Mercury Tours";
		Assert.assertEquals(expectedpagetitle,driver.getTitle());	
	}
	
	@Test(priority= 3, groups={"smoke test","functional Test"})
	public void closingbrowser() {
		
		driver.close();
		driver.quit();
		System.out.println("Login Succeful");
	}
}
