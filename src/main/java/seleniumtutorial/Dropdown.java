package seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.id("fruits"));

		// Create Select Class
		Select s = new Select(drop);

		// check this is multiple Web Element Type
		boolean check = s.isMultiple();
		System.out.println("This web-element is multiple : "+ check);

		s.selectByIndex(2);
		s.selectByVisibleText("Banana");
		s.selectByValue("grape");

		// Print the value in console
		List<WebElement> allSe = s.getAllSelectedOptions();

		// using for-loop
		for (int i = 0; i < allSe.size(); i++) {
			// create get Element
			WebElement opt = allSe.get(i);

			// get Text in console
			String text = opt.getText();
			System.out.println("The Text is :" + text);
		}
Thread.sleep(2000);
		driver.quit();
	}
}