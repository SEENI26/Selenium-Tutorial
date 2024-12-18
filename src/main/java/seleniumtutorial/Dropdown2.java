package seleniumtutorial;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 
{
public static void main(String[] args) {
	
	ChromeDriver driver =new ChromeDriver();
	
    try {
        // Navigate to the URL
        driver.get("http://demo.guru99.com/test/newtours/register.php");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Locate the drop-down element
        WebElement countryDropdown = driver.findElement(By.name("country"));

        // Use the Select class to handle the drop-down
        Select select = new Select(countryDropdown);

        // Get all options from the drop-down
        List<WebElement> countryOptions = select.getOptions();

        // Print each option's text
        System.out.println("List of Countries:");
        
        // Using Enhanced for loop:
        for (WebElement option : countryOptions) 
        {
            System.out.println(option.getText());
        }
        // Print the total number of countries
        System.out.println("Total number of countries: " + countryOptions.size());
    }
    finally 
    {
        // Close the browser
        driver.quit();
    }
}
}
