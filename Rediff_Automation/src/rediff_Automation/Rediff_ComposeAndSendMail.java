package rediff_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Rediff_ComposeAndSendMail extends BaseClass{
	
	@Test(priority=0, description = "Sign in")
	public void TC_1() {
		driver.findElement(By.linkText("Sign in")).click(); 
	}
	@Test(priority=1, description = "User Name")
	public void TC_2() {
		driver.findElement(By.id("login1")).sendKeys("palash1305");
	}
	@Test(priority=2, description = "Password")
	public void TC_3() {
		driver.findElement(By.id("password")).sendKeys("Xyzz_1305");
	}
	@Test(priority=3, description = "Sign in")
	public void TC_4() {
	    driver.findElement(By.name("proceed")).click();
	}
	@Test(priority = 4, description = "Write Mail")
	public void TC_5() throws InterruptedException {
	    driver.findElement(By.linkText("Write mail")).click();
	    Thread.sleep(10000);
	 
	}
	@Test(priority = 5, description = "Email ID of the Receiver")
	public void TC_6() {
	    driver.findElement(By.id("TO_IDcmp2")).sendKeys("akshaykkasbe@gmail.com");
	  
	}
	@Test(priority = 6, description = "Subject Line")
	public void TC_7() {
	    driver.findElement(By.cssSelector("input.rd_inp_sub")).sendKeys("Demo Mail");
	  
	}
	@Test(priority = 7, description = "Compose Email")
	public void TC_8() {
	    WebElement cframe = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
	    driver.switchTo().frame(cframe);
	    driver.findElement(By.cssSelector("body.cke_editable")).sendKeys("This is a Demo Mail.");
	  
	    driver.switchTo().defaultContent();
	}
	@Test(priority = 8, description = "Send mail")
	public void TC_9() {
	    driver.findElement(By.linkText("Send")).click();
  
	}
 
}
