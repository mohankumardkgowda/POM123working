package Object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMTab_Object {
	private static final String key = "About";
	WebDriver driver;
	public POMTab_Object(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ackButton") WebElement ackButton;
	@FindBy(xpath = "//nav[@class=\"nav-utility\"]//ul[@class='nav']//a[contains(text(), '"+ key +"')]") public WebElement tab_element;
	
	@SuppressWarnings("unused")
	public void tab_element(String txt) throws InterruptedException {
		// TODO Auto-generated method stub
	if (key == "Get Started" || key == "Home" || key == "About"|| key == "News"|| key == "ACC Quality Summit")

		{
			try {
				Thread.sleep(3000);
			    ackButton.click();
			    tab_element.click();
			

			} catch (Exception e) {
				tab_element.click();
				System.out.println("Exception caught" + e.getMessage());
			}
			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,50)");
			
		
	}else {
		System.out.println("Wrong key");
	}
	}		


	}

