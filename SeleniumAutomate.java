import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAutomate {

	/*Go to http://demoqa.com/ and automate the following:
 
1. Online registration – Fill the registration form and submit.

2. Interaction – Draggable, Droppable, Resizable, Selectable, Sortable.
(perform actions and validate that those happened as expected).

3. Misc stuff – Check text on all tabs from main page.

4. Frames – Click "Open New Separate Window" link and validate text on the new window, get back then to the main window and click on the logo at the top left.
 
Send your code in a GitHub project (GitHub url) with public access to the repo

*/
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","/Users/renumeg/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com");
		driver.manage().window().maximize();
		
		
		Register_Automate ra= new Register_Automate();
	    ra.automate(driver);
	    
	    //DraggableAutomate da = new DraggableAutomate();
	    //da.automate(driver);
	    
	   
	    
	    
	}
	
}

