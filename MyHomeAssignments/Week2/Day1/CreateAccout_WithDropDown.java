package Assignment_Week2Day1_D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccout_WithDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
				nametbox.sendKeys("RamHyundai25");
				
				//Enter a description as "Selenium Automation Tester." - Enter a Number Of Employees.
				WebElement desc_ml_tbox=driver.findElement(By.name("description"));
				desc_ml_tbox.sendKeys("Selenium Automation Tester");
				
				//Select "ComputerSoftware" as the industry. 
							
				WebElement industryName= driver.findElement(By.name("industryEnumId")); 
				new Select(industryName).selectByVisibleText("Computer Software"); 
				
				//Select "S-Corporation" as ownership using SelectByVisibleText. 
				WebElement ownershipName= driver.findElement(By.name("ownershipEnumId")); 
				new Select(ownershipName).selectByVisibleText("S-Corporation"); 
				
				
				//Select "Employee" as the source using SelectByValue. 
				WebElement sourceName = driver.findElement(By.id("dataSourceId")); 
				new Select(sourceName).selectByValue("LEAD_EMPLOYEE"); 
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
				WebElement marketingCampaign= driver.findElement(By.name("marketingCampaignId")); 
				new Select(marketingCampaign).selectByIndex(6);
				
				//Select "Texas" as the state/province using SelectByValue. 
				WebElement stateName = driver.findElement(By.name("generalStateProvinceGeoId")); 
				new Select(stateName).selectByValue("TX");
				
				Thread.sleep(4000);
				
				//Click the "Create Account" button. 
				WebElement submitdata =driver.findElement(By.className("smallSubmit"));
				submitdata.click();
				
				
				//Verify that the account name is displayed correctly. 
				WebElement acName= driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
				String actualAcName = acName.getText();
				String expectedAcName = "RamHyundai25";
				if (actualAcName.contains(expectedAcName))
					
					System.out.println("Account Name Verified Successfully");
				else 
					System.out.println("Account Name Is Incorrect");
				
				Thread.sleep(4000);
				//Close the browser window.
				driver.close();
	}

}
