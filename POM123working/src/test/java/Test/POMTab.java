package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Object.POMTab_Object;

public class POMTab extends  url{


	
	 POMTab_Object objectrepo;
		
		@Test(enabled=true)
		public void Verify_Tab() throws InterruptedException {
			
			objectrepo = new POMTab_Object(driver);
			objectrepo.tab_element("a");
		
		}
		@AfterTest
		public void aftertezt() 
		{
			// driver.quit();
		}
	}
