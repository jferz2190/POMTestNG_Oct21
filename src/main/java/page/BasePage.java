package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public int generateRandom(int boundaryNum) {
		Random ran = new Random();
		int generateRandom = ran.nextInt(boundaryNum);
		return generateRandom;

	}

	public void selectFromDropdown(WebElement webElement, String VisibleText) {
		Select sel = new Select(webElement);
		sel.selectByVisibleText(VisibleText);

	}

	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement webElement) {

		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}
}
