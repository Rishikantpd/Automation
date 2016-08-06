package mvc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Gdrive {
 	




	WebDriver driver;
	@Test
	public void f1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishi.kant.prasad\\Downloads\\Soft\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("mirishikant1");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("PxoXER4WERpFMFQ=");
		driver.findElement(By.id("signIn")).click();
		
		
		
	}
	

	

}
