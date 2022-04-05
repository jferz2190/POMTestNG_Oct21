package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	static String Browser = "chrome";
	static String url= "https://techfios.com/billing/?ng=admin/";
	public static WebDriver init() {
		
		if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_100.exe");
		driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.chrome.driver", "drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
