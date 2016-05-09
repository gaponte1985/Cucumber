package example;
 
import java.io.IOException;
 
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class download {
 
public static void main(String[] args) throws InterruptedException {
String baseUrl = "http://messenger.yahoo.com/";
WebDriver driver = new FirefoxDriver();

driver.get(baseUrl);
WebElement downloadButton = driver.findElement(By
.id("messenger-download"));
String sourceLocation = downloadButton.getAttribute("href");

String wget_command = "wget.exe -P c:/download --no-check-certificate " + sourceLocation;
System.out.println(wget_command);


try {
	Process exec = Runtime.getRuntime().exec(wget_command);
	int exitVal = exec.waitFor();
	System.out.println("Exit value: " + exitVal);
	System.out.println("Download completed");
	} catch (IOException ex) {
		System.out.println(ex.toString());
		System.out.println("Download failed");
		} 
driver.quit();
}
}

