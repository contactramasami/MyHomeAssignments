package Assignment_Week2Day1_D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); //object creation for chromedriver
		driver.manage().window().maximize();  // max browser window
		driver.get("http://leaftaps.com/opentaps/"); // launch URL 
		Thread.sleep(4000);  //java wait
	
		//Enter a username and password.
		WebElement uname = driver.findElement(By.id("username"));
		WebElement pwd= driver.findElement(By.name("PASSWORD"));
		uname.sendKeys("demosalesmanager");
		pwd.sendKeys("crmsfa");
		Thread.sleep(4000);  //java wait
		
		//Click the "Login" button.
		WebElement submit= driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		Thread.sleep(4000);  //java wait
		
		//Click on the "CRM/SFA" link.
		WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();
		
		//Click on the "Accounts" tab.
		WebElement actab=driver.findElement(By.linkText("Accounts"));
		actab.click();
		
		//Click on the "Create Account" button.
		WebElement createacbutton=driver.findElement(By.linkText("Create Account"));
		createacbutton.click();
		
		
		//Enter an account name.
		WebElement nametbox=driver.findElement(By.id("accountName"));
		nametbox.sendKeys("RamHyundai67");
		
		//Enter a description as "Selenium Automation Tester." - Enter a Number Of Employees.
		WebElement desc_ml_tbox=driver.findElement(By.name("description"));
		desc_ml_tbox.sendKeys("Selenium Automation Tester");
		
		
		//Enter a Site Name as “LeafTaps”
		WebElement sitenametbox=driver.findElement(By.id("officeSiteName"));
		sitenametbox.sendKeys("LeafTaps");
		
		//Click the "Create Account" button.
		WebElement cracbutton=driver.findElement(By.className("smallSubmit"));
		cracbutton.click();
		
		//Verify that the Title is displayed correctly.
		String pagetitle_actual= driver.getTitle();
		String pagetitle_expected="Account Details | opentaps CRM";
		if (pagetitle_actual.contains(pagetitle_expected))
			System.out.println("Page Title Verified Successfully");
		else
			System.out.println("Page Title Is Incorrect ");
		
		//driver.manage().window().wait(4000);
		Thread.sleep(9000); 
		
		//Close the browser window.
		driver.close();   
	}

}
