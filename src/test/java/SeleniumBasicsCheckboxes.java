import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicsCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriver driver= new ChromeDriver();  
		    driver.get("https://formy-project.herokuapp.com/checkbox");
		    driver.manage().window().maximize(); 
		    Thread.sleep(1000);
		    
		    driver.findElement(By.cssSelector("#checkbox-1")).click();    
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector("#checkbox-2")).click();    
		    Thread.sleep(1000); 
		    driver.findElement(By.cssSelector("#checkbox-3")).click();    
		    Thread.sleep(1000);
		    driver.quit();

	}


	   
}
