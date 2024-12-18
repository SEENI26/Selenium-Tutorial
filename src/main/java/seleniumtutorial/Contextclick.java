package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://lh.inmakesedu.com/");

		driver.manage().window().maximize();

		WebElement right = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/form/input"));

		Actions a = new Actions(driver);
		// ContextClick() method is used to perform a right-click action on a web
		// element
		a.contextClick(right).build().perform();

	}
}