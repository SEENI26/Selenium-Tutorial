package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public interface Mouseautomation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://lh.inmakesedu.com/");

		driver.manage().window().maximize();

		// create a object for action class
		Actions a = new Actions(driver);

		WebElement courses = driver.findElement(By.xpath("//a[@id=\"navbarDropdown\"]"));
		// to click the courses
		a.moveToElement(courses).perform();

		WebElement drop = driver.findElement(By.xpath("(//div[@class=\"dropdown dropright p-0 m-0\"])[10]"));

		a.moveToElement(drop).perform();

		WebElement drop2 = driver.findElement(By.xpath("//a[text()='ST Advanced class']"));

		drop2.click();
	}

}
