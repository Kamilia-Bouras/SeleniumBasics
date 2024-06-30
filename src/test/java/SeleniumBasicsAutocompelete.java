import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBasicsAutocompelete {
		
	public static void main(String[] args) throws InterruptedException {  
	        
		    WebDriver driver= new ChromeDriver();  
		    driver.get("https://formy-project.herokuapp.com/");
		    driver.manage().window().maximize(); 
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-lg' and text()='Autocomplete']"))).click();        
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("autocomplete"))).sendKeys(" 3000 Bd des Récollets");
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("street_number"))).sendKeys("");
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("locality"))).sendKeys("Trois rivieres");
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("administrative_area_level_1"))).sendKeys("Quebec");
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("postal_code"))).sendKeys("G9A 6J2");
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("country"))).sendKeys("Canada");
		    Thread.sleep(1000);
		    driver.quit();
		   
		}  

	}


