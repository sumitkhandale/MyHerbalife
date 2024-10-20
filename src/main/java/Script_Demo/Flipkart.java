package Script_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	WebDriver driver;
	
	@DataProvider
	public void search_Data() {
		Object[][] searchmobile = new Object[2][3];
		
	}
	@Test
	public void Search_Box(String brand,String variant) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement searchBox =  driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.click();
		searchBox.sendKeys(brand+" "+variant);
	}
}
