package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Pom_Script.Pom_Script;

public class TestRunner1 extends Base_Test{
	@Test(dataProvider = "testData")
	public void test2(String d1,String d2)
	{
		Pom_Script p=new Pom_Script(driver);
		p.passUN(d1);
		p.passPwd(d2);
		p.btn();
		//Assert.fail();
		
	}
	
	@DataProvider(name = "testData")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "aish", "admin" },
	   { "sush", "manager"},
	 };
	}
}
	
