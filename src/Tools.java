import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tools {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayNineTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		Select country = new Select(driver.findElement(By.id("continents")));
		country.selectByVisibleText("Australia");
		Select multiple = new Select(driver.findElement(By.id("continentsmultiple")));
		multiple.selectByVisibleText("South America");
		multiple.selectByVisibleText("Africa");
		Select index = new Select(driver.findElement(By.id("selenium_commands")));
		
		index.selectByIndex(2);
			
			
		
	}

}
