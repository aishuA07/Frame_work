package Generic_Script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_const1 {
	
	public WebDriver driver;
	@BeforeMethod
	public void openAppln() 
	{
		System.setProperty(gecko_key, gecko_value);
		//lauching the browser
		 driver = new FirefoxDriver();
		 //maximize the window
		 driver.manage().window().maximize();
		 driver.get(base_url);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}

	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Takess_Generic.getPhoto(driver);	
		}
		driver.close();
	}
}





