package login;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class Login_Test extends BaseClass{
	@Test
	public void loginDemoWebShop() {
		login.getLoginLink().click();
		login.getEmailTF().sendKeys("deepanareshmoopuri@gmail.com");
		login.getPasswordTF().sendKeys("Naresh*9440");
		login.getLoginButton().click();
	}
}
