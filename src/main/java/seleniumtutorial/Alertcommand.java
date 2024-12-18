package seleniumtutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcommand 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	//simple Alert
	WebElement alert = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]"));
	alert.click();
	
	// To switch alert 
	Alert a= driver.switchTo().alert();
	
	// to print the text Message
	String alerttext = a.getText();
	System.out.println("Alert Message: " +alerttext);
	Thread.sleep(1000);
	
	// confirm Alert
	a.accept();
	
	driver.close();
	driver.quit();
	}

}
