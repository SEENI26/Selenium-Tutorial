package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Keyboardactions2 {
	public static void main(String[] args) {
		// Set up WebDriver

		ChromeDriver driver = new ChromeDriver();
		try {
			// Open Flipkart
			driver.get("https://www.flipkart.com");

			// Maximize the window
			driver.manage().window().maximize();

			// Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// Close the login pop-up if it appears
			try
			 {
			 WebElement closeButton =
			driver.findElement(By.xpath("//button[contains(text(), '✕')]"));
			closeButton.click();
			 }
			catch (Exception e)
			 {
			 System.out.println("Login pop-up not found or already closed.");
			}

			// Find the search box
			WebElement searchBox = driver.findElement(By.name("q"));

			// Enter the search term 'moto'
			searchBox.sendKeys("iphone");

			// Wait briefly for suggestions to load
			Thread.sleep(2000);

			// Use the down arrow key to navigate the dropdown suggestions

			for (int i = 0; i < 4; i++) {
				// Adjust loop for the number of suggestions

				searchBox.sendKeys(Keys.ARROW_DOWN);

				Thread.sleep(500);
				// Wait for visibility to change
			}

			// Press ENTER to select the currently highlighted suggestion
			searchBox.sendKeys(Keys.ENTER);

			// Wait for search results to load
			Thread.sleep(5000);

			// Print the page title to confirm navigation
			System.out.println("Page Title: " + driver.getTitle());

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
