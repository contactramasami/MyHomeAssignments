package Assignment_Week2Day1_D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_AcccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); //object creation for chromedriver
		driver.manage().window().maximize();  // max browser window
		driver.get("https://www.facebook.com/"); // launch URL
		
		//Click on the Create new account button. 
		WebElement newAcButton = driver.findElement(By.partialLinkText("Create new account"));
		newAcButton.click();
		
		Thread.sleep(4000);
		// Enter the First name. 
		WebElement fName =driver.findElement(By.name("firstname"));
		fName.sendKeys("Ram");
				
		Thread.sleep(4000);
		
		// Enter the Surname. 
		WebElement sName =driver.findElement(By.name("lastname"));
		sName.sendKeys("Arumuga");
		
		// Enter the Mobile number or email address. 
		WebElement mobile=driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("ram@gmail.com");
		
		// Enter the New password. 
		WebElement rPwd =driver.findElement(By.name("reg_passwd__"));
		rPwd.sendKeys("Welcome@123");
		
		// Handle all three dropdowns in Date of birth
		WebElement bdaydate = driver.findElement(By.name("birthday_day")); 
		new Select(bdaydate).selectByVisibleText("31"); 
		
		WebElement bdaymonth = driver.findElement(By.name("birthday_month")); 
		new Select(bdaymonth).selectByIndex(7) ;
		
		WebElement bdayyear= driver.findElement(By.name("birthday_year")); 
		new Select(bdayyear).selectByValue("1984"); 
		
		// Select the radio button in Gender.
		WebElement genderMaleRadio=driver.findElement(By.xpath("//label[text()='Male']"));
		genderMaleRadio.click();
		
		Thread.sleep(4000);
		
		// Submit the data by clicking "Sign Up"
		WebElement formSubmit=driver.findElement(By.name("websubmit"));
		formSubmit.click();
		
		Thread.sleep(4000);
		
	}

}
