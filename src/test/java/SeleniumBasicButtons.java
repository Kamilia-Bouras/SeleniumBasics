import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	
public class SeleniumBasicButtons {

		
	public static void main(String[] args) throws InterruptedException {  
	        
		    WebDriver driver= new ChromeDriver();  
		    driver.get("https://formy-project.herokuapp.com/buttons");
		    driver.manage().window().maximize(); 
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-lg' and text()='Autocomplete']"))).click();        
		    WebElement button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
		 // Click the button Primary
            button.click();
		    Thread.sleep(1000);
		    button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-success"));
		 // Click the button Success
            button.click();
            Thread.sleep(1000);
		    button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-info"));
		 // Click the button Info
            button.click();
            Thread.sleep(1000);
            button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-warning"));
   		 // Click the button Warning
            button.click();
            Thread.sleep(1000);
            
            button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-danger"));
   		 // Click the button Danger
            button.click();
            Thread.sleep(1000);
            
            button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-link"));
   		 // Click the button Link
            button.click();
            Thread.sleep(1000);
            
            button = driver.findElement(By.cssSelector("div.container div.form-group.row:nth-child(2) div.input-group div.col-sm-8 div.btn-group > button.btn.btn-lg.btn-primary:nth-child(1)"));
   		 // Click the button left
            button.click();
            Thread.sleep(1000);
            
            button = driver.findElement(By.cssSelector("div.container div.form-group.row:nth-child(2) div.input-group div.col-sm-8 div.btn-group > button.btn.btn-lg.btn-primary:nth-child(2)"));
      		 // Click the button middle
            button.click();
            Thread.sleep(1000);
            
            button = driver.findElement(By.cssSelector("div.container div.form-group.row:nth-child(2) div.input-group div.col-sm-8 div.btn-group > button.btn.btn-lg.btn-primary:nth-child(3)"));
     		 // Click the button right
           button.click();
           Thread.sleep(1000);
           
           
           button = driver.findElement(By.cssSelector("div.container div.form-group.row:nth-child(3) div.input-group div.col-sm-8 div.btn-group > button.btn.btn-lg.btn-primary:nth-child(1)"));
   		 // Click the button 1
         button.click();
         Thread.sleep(1000);
         
         button = driver.findElement(By.cssSelector("div.container div.form-group.row:nth-child(3) div.input-group div.col-sm-8 div.btn-group > button.btn.btn-lg.btn-primary:nth-child(2)"));
   		 // Click the button 2
         button.click();
         Thread.sleep(1000);
         
         button = driver.findElement(By.cssSelector("#btnGroupDrop1"));
   		 // Click the button Dropdown
         button.click();
         Thread.sleep(1000);
         
         button = driver.findElement(By.cssSelector("div.container div.form-group.row:nth-child(3) div.input-group div.col-sm-8 div.btn-group div.btn-group.show:nth-child(3) div.dropdown-menu.show > a.dropdown-item:nth-child(1)"));
   		 // Click the button Dropdown Link1
         button.click();
         Thread.sleep(1000);
         
         
         button = driver.findElement(By.cssSelector("#btnGroupDrop1"));
   		 // Click the button Dropdown
         button.click();
         Thread.sleep(1000);
         
         button = driver.findElement(By.cssSelector("div.container div.form-group.row:nth-child(3) div.input-group div.col-sm-8 div.btn-group div.btn-group.show:nth-child(3) div.dropdown-menu.show > a.dropdown-item:nth-child(2)"));
   		 // Click the button Dropdown Link2
         button.click();
         Thread.sleep(1000);

            
		    Thread.sleep(1000);
		    driver.quit();
		   
		}  

	}

