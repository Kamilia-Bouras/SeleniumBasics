import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumBasicsDatepicker {

	public static void main(String[] args) throws InterruptedException {
		

		   WebDriver driver= new ChromeDriver();  
		    driver.get("https://formy-project.herokuapp.com/datepicker");
		    driver.manage().window().maximize(); 
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("datepicker")).click();    
		    
		    WebElement dateInput = driver.findElement(By.id("datepicker"));
            dateInput.sendKeys("01/06/1979");
		    
		    
		    Thread.sleep(1000);
		    
		    driver.quit();

	}

}
