import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicsBropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();  
	    driver.get("https://formy-project.herokuapp.com/dropdown");
	    driver.manage().window().maximize(); 
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("dropdownMenuButton")).click(); 
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("body:nth-child(2) div.container div.dropdown.show:nth-child(5) div.dropdown-menu.show > a.dropdown-item:nth-child(4)")).click();
	    Thread.sleep(1000);
	    
	    driver.quit();

	}

}
