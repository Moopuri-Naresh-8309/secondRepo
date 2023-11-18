package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerImplementation extends BaseClass implements IAutoConstants, ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot TS = (TakesScreenshot) driver;
		File photoFile = TS.getScreenshotAs(OutputType.FILE);
		File file = new File(sS_PATHString+result.getName()+".png");
		try {
			FileUtils.copyFile(photoFile, file);
		} catch (IOException e) {
			e.printStackTrace();
		}	}

	
}