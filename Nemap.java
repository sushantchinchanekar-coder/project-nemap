package seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nemap {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://test.fieldforceconnect.com/");
		
		
//        driver.findElement(By.linkText("Sign up")).click();
//        driver.findElement(By.xpath("//input[@placeholder=\"Enter company name\"]")).sendKeys("patil Cyber");
//        driver.findElement(By.xpath("//input[@placeholder=\"Enter contact person name\"]")).sendKeys("sushant patil");
//        driver.findElement(By.xpath("//input[@placeholder=\"Enter email address\"]")).sendKeys("sushantchinchanekar@gmail.com");
//        driver.findElement(By.xpath("//input[@placeholder=\"Enter mobile number\"]")).sendKeys("7666783801");
//        driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();
//        
//        driver.findElement(By.xpath("//input[@placeholder=\"OTP\"]")).sendKeys("7416");
//        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("sushant@123");
//        driver.findElement(By.xpath("//input[@placeholder=\"Confirm Password\"]")).sendKeys("sushant@123");
//        driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();
//        
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("7666783801");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
		
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("7666783802");
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("sushant@1234");
//		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
//		
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("7666783801");
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("sushant@123456");
//		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
//		
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("7057570947");
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("sushant@1234");
//		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
//		
//		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
//		
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("");
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("sushant@1234");
//		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
//		
//		driver.findElement(By.xpath("//a[text()=\"Forgot Password?\"]")).click();
//
//        driver.findElement(By.xpath("//input[@name=\"emailOrMob\"]")).sendKeys("7666783801");
//        driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//input[@name=\"OTP\"]")).sendKeys("");
//        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("sushant@123");
//        driver.findElement(By.xpath("//input[@placeholder=\"Confirm Password\"]")).sendKeys("sushant@123");
//        driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();
        
          driver.findElement(By.xpath("//div[@style=\"--Paper-shadow: none;\" and @class=\"sc-gnpauu dBGqKg MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0\"]")).click();
         
        		String actualMsg1 = driver.findElement(By.xpath("//*[contains(text(),'No data available for this section')]")).getText();
                System.out.println("Actual Message: " + actualMsg1);
                if (actualMsg1.equals("No data available for this section")) {
        		System.out.println("Test Case pass");
        		}
                else
                {
        	    System.out.println("Test Case fail");
        		}
		List<WebElement> messages = driver.findElements(By.xpath("//*[contains(.,'No data available')]"));
         for (WebElement message : messages) 
		{
         String actualMsg = message.getText();
         System.out.println("Actual Message: " + actualMsg);

		    if (actualMsg.contains("No data available for this section")) {
		        System.out.println("Test Case PASS");
		    } else {
		        System.out.println("Test Case FAIL");
		    }
		}
         driver.findElement(By.xpath("//span[text()=\"My Customers\"]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[@class=\"_navLink_onbwl_74\" and @href=\"/customers\"]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@aria-haspopup=\"true\"]")).click();
         driver.findElement(By.xpath("//span[text()=\"New Customer\"]")).click();
  
         driver.findElement(By.xpath("//input[@name=\"LeadName\"]")).sendKeys("omkar patil");
         driver.findElement(By.xpath("//input[@name=\"RefNo\"]")).sendKeys("101214");
         driver.findElement(By.xpath("//input[@name=\"PersonName\"]")).sendKeys("mohan patil");
         driver.findElement(By.xpath("//input[@name=\"MobileNo\"]")).sendKeys("1234567893");
         driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("omkar@gmail.com");
         driver.findElement(By.xpath("//input[@role=\"combobox\"]")).sendKeys("Qa tester");
         driver.findElement(By.xpath("//input[@name=\"PersonLocation\"]")).sendKeys("kolhapur");
      WebElement countrydropdown=  driver.findElement(By.xpath("(//div[@role=\"combobox\"]) [3]"));
      Select select = new Select(countrydropdown);
      select.selectByVisibleText("India");
      System.out.println(countrydropdown);
    WebElement countrydropdown1= driver.findElement(By.xpath("(//div[@role=\"combobox\"]) [4]"));
    Select select1 = new Select(countrydropdown1);
    select1.selectByVisibleText("maharastra");
    
    WebElement country=driver.findElement(By.xpath("(//div[@class=\"sc-kyZUkZ sc-krqTko dRQmNm fdgyba MuiSelect-select MuiSelect-standard sc-huvEYo sc-bHSkpg kldoOz MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall\"]) [4]"));
	Select select2 =new Select(country);
	select2.selectByVisibleText("mumbai");
	
	WebElement lion=driver.findElement(By.xpath("(//div[@class=\"sc-kyZUkZ sc-krqTko dRQmNm fdgyba MuiSelect-select MuiSelect-standard sc-huvEYo sc-bHSkpg kldoOz MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall\"]) [2]"));
	Select select3=new Select(lion);
	select3.deselectByVisibleText("India");
	
	driver.findElement(By.xpath("(//button[@type=\"button\"])[13]")).click();
	
        
         }

	}

