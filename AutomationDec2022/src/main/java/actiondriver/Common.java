package actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Common {

	private WebDriver driver;

	public void click(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();

	}

	public void findElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully found element");
			} else {
				System.out.println("Unable to locate element");
			}
		}
	}

	public boolean selectByIndex(WebElement element ,int index) {
		boolean flag=false;
		try {
			Select s=new Select(element);
			s.selectByIndex(index);
			flag=true;
			return true;
		}
		catch (Exception e) {
			return false;
		}
		finally {
			if(flag) {
				System.out.println("Option is selected");
			}
			else {
				System.out.println("Option is not selected");
				
			}
		}
		
	}
	public boolean mouseHoverByJavaScript(WebElement ele) {
		boolean flag = false;
		try {
			WebElement mo = ele;
			String javaScript = "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
					+ "arguments[0].dispatchEvent(evObj);";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(javaScript, mo);
			flag = true;
			return true;
		}

		catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("MouseOver Action is performed");
			} else {
				System.out.println("MouseOver Action is not performed");
			}
		}
	}
}
