package genericUtility;
/**
 * @author moopu
 */
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * this is used to enter the data into textfield
 * @param element
 * @param data
 */
public class JavaScriptUtility extends BaseClass {
	public void enteringDataIntoElement(WebElement element, String data) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("argument[0].value='" + data + "'", element);
	}

	public void clickingOnEleemnt(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("argument[0].click();", element);
	}

	public void scrollingThePage(int x, int y) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("scrollBy("+x+","+y+")");
	}
}
