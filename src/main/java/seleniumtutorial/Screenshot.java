package seleniumtutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
public static void main(String[] args) throws IOException {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	// Step 1 Type casting
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	//Step 2 Use Get screen shoot as
	File img = ts.getScreenshotAs(OutputType.FILE);
	
	// step 3 Create a designation file
	File f =new File("C:\\Users\\seeni\\eclipse-workspace\\Tutorial\\library\\Webpage Screenshot\\fb1.png");
	
	// Step 4 Copy file content from Temporary Folder to designation Folder
	
	FileUtils.copyFile(img, f);
	
}
}
