package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
public static WebDriver driver; // initializing driver
public static void setupDriver(){
	//System.setProperty("webdriver.chrome.driver", "/Users/mackhld/Downloads/chromedriver_mac64");
	WebDriverManager.chromedriver().setup(); //getting the chrome driver from cloud
	ChromeOptions Options = new ChromeOptions();// initializing chrome options
	Options.addArguments("--start-maximized"); //add argument to maximize browser
	Options.addArguments("--disable-notifications");// add arguments to disable browser
//	Options.addArguments("--headless");            // headless execution
	driver = new ChromeDriver(Options);
	driver.get("https://www.ebay.com/");          // loading the page
	
}
public static WebDriver getDriver(){
	return driver;								// return driver to call
}
public static void tearDownDriver(){
	driver.close();								// closing current driver
	driver.quit();								// closing all driver
	
}
}

