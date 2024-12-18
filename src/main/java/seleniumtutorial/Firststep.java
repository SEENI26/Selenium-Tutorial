package seleniumtutorial;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firststep 
{
public static void main(String[] args) 
{
	// launch browser comment
	ChromeDriver driver =new ChromeDriver();
	 
	// maximize window comment
	driver.manage().window().maximize();
	
	// Pass Url comment
	driver.get("https://www.amazon.in/");
	
	// get website page title
	String title = driver.getTitle();
	System.out.println("Current website : " + title);
	
	//get current URL link
	String Url = driver.getCurrentUrl();
	System.out.println("Current URL Link : " + Url);
	
	// close the current Web page browser
	driver.close();
	
	// close the browser
	driver.quit();
}
}
 