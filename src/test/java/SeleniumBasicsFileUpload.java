import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class SeleniumBasicsFileUpload {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver= new ChromeDriver();  
		    driver.get("https://formy-project.herokuapp.com/fileupload");
		    driver.manage().window().maximize(); 
		    Thread.sleep(1000);
		    
		   
		    // driver.findElement(By.cssSelector("div.container form:nth-child(4) div.form-group:nth-child(1) div.input-group.input-file span.input-group-btn:nth-child(1) > button.btn.btn-secondary.btn-choose")).click();
		    //Thread.sleep(1000);
		    
		    WebElement fileInput = driver.findElement(By.id("file-upload-field"));
		    fileInput.sendKeys("C:/Users/Kamilia/Downloads/file1.txt");
		    Thread.sleep(1000);

            // Optionally, locate and click the upload button
            WebElement uploadButton = driver.findElement(By.cssSelector("div.container form:nth-child(4) div.form-group:nth-child(1) div.input-group.input-file span.input-group-btn:nth-child(3) > button.btn.btn-warning.btn-reset"));
            uploadButton.click();
            Thread.sleep(1000);
		    
		    driver.quit();

		}

	}



