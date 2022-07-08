package rediff_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver; //Global Variable
  
  @BeforeClass
  public void browserSetup() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Workspace\\Rediff_Automation\\Driver\\Driver v103\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.rediff.com/");
	  Thread.sleep(5000);
  }
  
  @AfterClass
  public void tearDown() { 
	driver.quit();
  }

}
