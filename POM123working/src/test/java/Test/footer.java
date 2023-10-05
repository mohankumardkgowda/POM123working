package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import Object.footer_object;

public class footer extends  url{

 footer_object objectrepo;
	
	@Test(enabled=true)
	public void Verify_Tab() throws InterruptedException {
		
		objectrepo = new footer_object(driver);
		objectrepo.footer_element("a");
	
	}
	@AfterTest
	public void aftertezt() 
	{
		// driver.quit();
	}
}


