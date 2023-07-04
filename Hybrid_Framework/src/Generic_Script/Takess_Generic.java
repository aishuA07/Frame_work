package Generic_Script;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Takess_Generic extends Base_Test{
	
	public static void getPhoto(WebDriver driver) throws IOException 
	{
		
		   String Photo="./Photos";
            Date d = new Date(0);
		    String d1 = d.toString();
		    String d2 = d1.replaceAll(":", "-");
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		    File dst = new File(Photo+d2+".jpeg");
		    FileHandler.copy(src, dst);
		
	}

}
