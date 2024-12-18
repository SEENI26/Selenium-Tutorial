package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugmethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		// launch browser comment
		ChromeDriver driver =new ChromeDriver();
		
		// Pass Url comment
		driver.get("https://www.facebook.com/?_rdr");	
		
		// maximize window comment
				driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//thread method
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

}
}