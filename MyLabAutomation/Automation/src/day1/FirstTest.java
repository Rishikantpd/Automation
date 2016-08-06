/**
 * 
 */
package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rishi.kant.prasad
 *
 */
public class FirstTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/rishi.kant.prasad/Documents/TechAuto/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
		//WebDriver driver=new FirefoxDriver();
		String baseUrl="http://newtours.demoaut.com";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Pass");
		}
		else{
			System.out.println("Test Failed");
		}
		//driver.close();
		
			
		}
		
		
	}

