import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Automate {

	void automate(WebDriver driver)
	{
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside[1]/div[2]/div/ul/li/a")).click();
		
		DateFormat dateFormat= new SimpleDateFormat("ddHHmmss");
		Date date = new Date();
		String random_number = dateFormat.format(date);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("name_3_firstname")));
		element.sendKeys("TestUserMeg"+random_number);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[1]/div[1]/div[1]/input ")).sendKeys("TestUserMalali");
	   
	    //Select "Married" radio button
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[2]/div/div/input[2]")).click();
	    
	    //Select Hobby "Reading"
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[3]/div/div/input[2]")).click();
	    
	    Select select_country_USA = new Select(driver.findElement(By.id("dropdown_7")));
	    
	    select_country_USA.selectByValue("United States");
	    
	    Select month_June = new Select(driver.findElement(By.id("mm_date_8")));
	    
	    month_June.selectByValue("6");
	    
	    Select day_7 = new Select(driver.findElement(By.id("dd_date_8")));
	    
	    day_7.selectByValue("7");
	    
	    Select year_1986 = new Select(driver.findElement(By.id("yy_date_8")));
	    
	    year_1986.selectByValue("1986");
	    
	    driver.findElement(By.id("phone_9")).sendKeys("5554542345");
	    driver.findElement(By.id("username")).sendKeys("test_meg"+random_number);
	    driver.findElement(By.id("email_1")).sendKeys("test_meg"+random_number+"@email.com");
	    
	    WebElement filepath=driver.findElement(By.id("profile_pic_10"));
	    //filepath.click();
	    filepath.sendKeys("/Users/renumeg/Desktop/me.png");
	    
	    driver.findElement(By.id("description")).sendKeys("I love Selenium");
	    
	    driver.findElement(By.id("password_2")).sendKeys("abc123!!");
	    
	    driver.findElement(By.id("confirm_password_password_2")).sendKeys("abc123!!");
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[14]/div/input")).click();
	    
	    WebDriverWait wait_after_submit= new WebDriverWait(driver, 40);
	    Boolean reg_complete = wait_after_submit.until(ExpectedConditions
	    		.textToBe(
	    			
	    					By.className("piereg_message"), 
	    					"Thank you for your registration"
	    			));
	    
	    if (reg_complete.booleanValue()==true)
	    	System.out.println("Successful Registration automated.");
	}
	
}
