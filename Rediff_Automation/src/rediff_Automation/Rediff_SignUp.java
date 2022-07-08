package rediff_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Rediff_SignUp extends BaseClass {
	

	@Test(priority=0, description = "Create Account")
	public void TC_1() {
		driver.findElement(By.linkText("Create Account")).click();
		
	}
	@Test(priority=1, description = "User Name")
	public void TC_2() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Palash");
	}
	@Test(priority=2, description = "Credentials")
	public void TC_3() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("palash1305");
		
	}
	@Test(priority=3, description = "Availability of Credentials")
	public void TC_4() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]")).click();
		
	}
	@Test(priority=4, description = "Password")
	public void TC_5() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("Xyzz_1305");
		
	}
	@Test(priority=5, description = "Confirm Password")
	public void TC_6() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("Xyzz_1305");
		
	}
	@Test(priority=6, description = "Alternate Email ID")
	public void TC_7() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input")).sendKeys("palashshahare@yahoo.in");
		
	}
	@Test(priority=7, description = "CheckBox if no alternate Email ID")
	public void TC_8() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		
	}
	@Test(priority=8, description = "Security Question")
	public void TC_9() {
		WebElement secQuestion = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[16]/td/div/table/tbody/tr[2]/td[3]/select"));
		Select dropDown = new Select(secQuestion);
		dropDown.selectByVisibleText("What is your favourite food?");
		
	}
	@Test(priority=9, description = "Security Answer")
	public void TC_10() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[16]/td/div/table/tbody/tr[4]/td[3]/input")).sendKeys("Pizza");
		
	}
	@Test(priority=10, description = "Mother's Maiden Name")
	public void TC_11() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[16]/td"
				+ "/div/table/tbody/tr[6]/td[3]/input")).sendKeys("xyz");
		
	}
	@Test(priority=11, description = "Mobile Number")
	public void TC_12() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[20]/td/div/table/tbody/tr/td[3]/div[3]/input")).sendKeys("9503700095");
		
	}
	@Test(priority=12, description = "DOB-Day")
	public void TC_13() {
		WebElement dayDropDown = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		Select dropDown = new Select(dayDropDown); 
		dropDown.selectByIndex(13);
		
	}
	@Test(priority=13, description = "DOB-Month")
	public void TC_14() {
		WebElement monthDropDown = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]"));
		Select dropDown = new Select(monthDropDown); 
		dropDown.selectByValue("05");
		
	}
	@Test(priority=14, description = "DOB-Year")
	public void TC_15() {
		WebElement yearDropDown = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
		Select dropDown = new Select(yearDropDown); 
		dropDown.selectByValue("1996"); 
		
	}
	@Test(priority=15, description = "Credentials")
	public void TC_16() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[2]")).click();
		
	}
	
	@Test(priority=16, description = "City")
	public void TC_17() throws InterruptedException  {
		WebElement cityDropDown = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[28]/td/div/table/tbody/tr[1]/td[3]/select"));
		Select dropDown = new Select(cityDropDown); 
		dropDown.selectByValue("Nagpur");
		Thread.sleep(10000);
		
	}
	@Test(priority=17, description = "Create My Account link")
	public void TC_18() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[32]/td[3]/input")).click();
		
	}
	@Test(priority=18)
	public void TC_19() throws InterruptedException {
		driver.findElement(By.id("Register")).click();
		Thread.sleep(20000);
	}
	@Test(priority=19, invocationCount = 0)
	public void TC_20() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[3]/tbody/tr[5]/td/table/tbody/tr[1]/td[5]/label/input")).click();
	}
	@Test(priority=20, invocationCount = 0)
	public void TC_21() {
		driver.findElement(By.xpath("/html/body/center/form/div/table[3]/tbody/tr[5]/td/table/tbody/tr[1]/td[3]/div[3]/input")).sendKeys("xxxxxxxxxx");
	}
	@Test(priority=21, invocationCount = 0)
	public void TC_22() {
		driver.findElement(By.linkText("Click here")).click();
	}
	@Test(priority=22, description = "OTP validation link")
	public void TC_23() {
		driver.findElement(By.id("Register")).click();
	}
	@Test(priority=23, description = "Sign in link")
	public void TC_24() {
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[15]/td[4]/table/tbody/tr/td[1]/input")).click();
	}
}
	
