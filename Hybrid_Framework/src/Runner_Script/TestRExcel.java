package Runner_Script;

import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Generic_Script.DDT_Generic;
import Pom_Script.Pom_Script;

public class TestRExcel extends Base_Test {
	
	@Test
	public void test()
	{
		String un=DDT_Generic.getData("Sheet1", 0, 0);
		String pwd=DDT_Generic.getData("Sheet1", 0, 1);
		
		Pom_Script f1 = new Pom_Script(driver);
		f1.passUN(un);
		f1.passPwd(pwd);
		f1.btn();
			
			
		}
	}


