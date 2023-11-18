package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Register")
	private WebElement registerLink;
	public WebElement getRegisterLink() {
		return registerLink;
	}
	@FindBy(id = "gender-male")
	private WebElement genderRadioButton;
	@FindBy(id="FirstName")
	private WebElement firstNameTF;
	@FindBy(id="LastName")
	private WebElement lastNameTF;
	@FindBy(id="Email")
	private WebElement EmailTF;
	@FindBy(id="Password")
	private WebElement passwordTF;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTF;
	@FindBy(id="register-button")
	private WebElement registerButton;
	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}
	public WebElement getFirstNameTF() {
		return firstNameTF;
	}
	public WebElement getLastNameTF() {
		return lastNameTF;
	}
	public WebElement getEmailTF() {
		return EmailTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getConfirmPasswordTF() {
		return confirmPasswordTF;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
}
