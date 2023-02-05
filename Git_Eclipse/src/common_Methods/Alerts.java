package common_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		// "Add code here "
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Jars_Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

	}

}
