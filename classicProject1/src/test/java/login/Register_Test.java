package login;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class Register_Test extends BaseClass{
	@Test
	public void RegisterDemoWebShop() {
		register.getRegisterLink().click();
		register.getGenderRadioButton().click();
		register.getFirstNameTF().sendKeys("moopuri");
		register.getLastNameTF().sendKeys("naresh");
		register.getEmailTF().sendKeys("Narersh@gmail.com");
		register.getPasswordTF().sendKeys("Naresh");
		register.getConfirmPasswordTF().sendKeys("Naresh");
		register.getRegisterButton().click();
	}
}
