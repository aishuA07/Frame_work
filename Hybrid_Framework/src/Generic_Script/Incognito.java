package Generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		 WebDriver driver = new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");

	}

}
