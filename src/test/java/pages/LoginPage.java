package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 WebDriver Pagedriver;
 
 //========================== * Objects * ===================================
 //when annotation is used we dont need to write FindElement.By again 
 
 @FindBy(linkText="Log in")
 WebElement LoginLink;
 
 @FindBy(name="user_login")
 WebElement UserName;
 
 @FindBy(id="password")
 WebElement Password;
 
 @FindBy(className="rememberMe")
 WebElement remember;
 
 @FindBy(name="btn_login")
 WebElement LoginBtn;
 
  
 // ======================= *Methods * ==========================================
 
 public LoginPage(WebDriver driver) {
	 
	 Pagedriver = driver;
	 //When @Findby is used we have to write PageFactory
	 PageFactory.initElements(Pagedriver,this);
	 
 }
	
	public void LoginFunction(String UsernameVal, String PwdVal) {
		
		LoginLink.click();
		UserName.sendKeys(UsernameVal);
		Password.sendKeys(PwdVal);
		remember.click();
		//WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}
}
