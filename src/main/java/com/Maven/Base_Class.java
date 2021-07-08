package com.Maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;     //null
	
//web element methods & web driver methods
	
	//14.1.dropdown          //can be done in one step or can do individually as below
//		public static void dropdown(WebElement element,String value,String i) {
//			Select s= new Select(element);
//			if (value.equals("index")) {
//				s.selectByIndex(Integer.parseInt(i));
//			}else if (value.equals("Value")) {
//				s.selectByValue(value);
//			}else if (value.equals("text")) {
//				s.selectByVisibleText(value);
//			}
//			}
	//14.1.single DD-select by index
		public static void selectIndex(WebElement element, int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
		}
	//14.2.single DD-select by value
		public static void selectValue(WebElement element, String values) {
			Select s = new Select(element);
			s.selectByValue(values);
		}
	//14.3.single DD-select by text
		public static void selectText(WebElement element, String text) {
			Select s = new Select(element);
			s.selectByVisibleText(text);
		}
	//14.4.multiple DD
		public static void multipleDropdown(WebElement element, int a, int b, int c) {
			Select s = new Select(element);
			List<WebElement> alloption = s.getOptions();
			int size = alloption.size();
			for (int i = 0; i < size; i++) {
				if (i==a||i==b||i==c) {
					s.selectByIndex(i);
		}
		}
		}
		
	//1.browserlaunch
		public static WebDriver browserLaunch(String browser) {
			
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "path");
				driver = new FirefoxDriver();
			}
			else {
				System.out.println("INVALID BROWSER");
			}	
			driver.manage().window().maximize();
			return driver;
		}
	//2.close
		public static void close() {
			driver.close();
		}
	//3.quit
		public static void quit() {
			driver.quit();
		}
	//4.navigate to 
		public static void navigateTo(String toUrl) {
			driver.navigate().to(toUrl);
		}
	//5.navigate back
		public static void navigateBack() {
			driver.navigate().back();
		}
	//6.navigate forward
		public static void navigateForward() {
			driver.navigate().forward();
		}
	//7.navigate refresh
		public static void navigateRefresh() {
			driver.navigate().refresh();
		}
	//31.click
		public static void clickOnElement(WebElement element) {
			element.click();
		}
	//27.sendkeys
		public static void sendValues(WebElement element, String values) {
			element.sendKeys(values);
		}
	//32.clear
		public static void erase(WebElement element) {
			element.clear();
		}
	//15.checkbox
		public static void checkBox(WebElement element) {
			element.click();
		}
	//8.get
		public static void getUrl(String Url) {
			driver.get(Url);
		}
	//19.get options
		public static void getOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> getOptions = s.getOptions();
			for (WebElement options : getOptions) {
				System.out.println(options.getText());
			}
		}
	//20.get title
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
	//21.getcurrenturl
		public static void getcurrentUrl(WebElement element) {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
	//22.gettext
		public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
	//23.get attribute
		public static void getAttribute(WebElement element, String attribute) {
			String getattribute = element.getAttribute(attribute);
			System.out.println(getattribute);
		}
	//28.get first selected option
		public static void getFirstSelectedOption(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}
	//29.get all selected options
		public static void getAllSelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement allSelected : allSelectedOptions) {
				System.out.println(allSelected.getText());
			}
		}
	//30.is multiple
		public static void isMultiple(WebElement element) {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println("Is it multiple ?"+multiple);
		}
	//16.is enabled
		public static void isEnabled(WebElement element) {
			boolean enabled = element.isEnabled();
			System.out.println("Is it enabled ?"+enabled);
		}
	//17.is displayed
		public static void isDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println("Is it displayed ?"+displayed);
		}
	//18.is selected
		public static void isSelected(WebElement element) {
			boolean selected = element.isSelected();
			System.out.println("Is it selected ?"+selected);
		}	
	//24.1.implicit wait
		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			}
		
	//24.2.explicit wait
		public static void explicitWait(By xpath) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			}
	//24.3.fluent wait
		public static void fluentWait() {
		FluentWait wait1 = new FluentWait(driver);
		wait1.withTimeout(4,TimeUnit.SECONDS);
		wait1.pollingEvery(1, TimeUnit.SECONDS);
		wait1.ignoring(NoSuchElementException.class);		
		}
	//25.screenshot
		public static void screenshot(String pathandname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;	
		File source = ts.getScreenshotAs(OutputType.FILE);  
		File destination = new File(pathandname);   
		FileUtils.copyFile(source, destination); 
		}
	//26.1.scrollup
		public static void scrollUp(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
		}
	//26.2scrolldown
		public static void scrollDown() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
	//11.1.framedefault
		public static void frameDefault() {
			driver.switchTo().defaultContent();
		}
	//11.2.frameparent
		public static void frameParent() {
			driver.switchTo().parentFrame();
		}
	//11.3.framebyindex
		public static void frameIndex(int index) {
			driver.switchTo().frame(index);
		}
	//11.4.framebyname
		public static void frameName(String name) {
			driver.switchTo().frame(name);
		}
	//11.4.framebywebelement
		public static void frameWebelement(WebElement element) {
			driver.switchTo().frame(element);
		}
	//9.1.alert
		public static void alert() {
			driver.switchTo().alert();
		}
	//9.2.alert accept
		public static void alertAccept() {
			driver.switchTo().alert().accept();
		}		
	//9.3.alert dismiss
		public static void alertDismiss() {
			driver.switchTo().alert().dismiss();
		}	
	//9.4.alert sendkeys
		public static void alertSendkeys(String input) {
			driver.switchTo().alert().sendKeys(input);
		}	
	//9.5.alert gettext
		public static void alertText() {
			driver.switchTo().alert().getText();
		}	
	//10.1.action click
		public static void actionClick(WebElement element) {
			Actions act = new Actions(driver);
			act.click(element).build().perform();
		}
		
	//10.2.action contextclick
		public static void actionContextClick(WebElement element) {
			Actions act = new Actions(driver);
			act.contextClick(element).build().perform();
		}		
	//10.3.actions doubleclick
		public static void actionDoubleClick(WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
		}
	//10.4.actions movetoelement
		public static void ActionMoveToElement(WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
		}
	//12.1.action robot down
		public static void robotDown() throws AWTException {
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
	//12.1.action robot enter
		public static void robotEnter() throws AWTException {
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		}	
	//13.1.windowhandle gettitle
		public static void windowhandleGettitle() {
			Set<String> allid = driver.getWindowHandles();
			for (String id : allid) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
		}
		}
	//13.2.windowhandle currenttitle
		public static void windowhandleActualtitle(String selectedtitle) {
			Set<String> allid = driver.getWindowHandles();
			String actualtitle = selectedtitle;
			for (String id : allid) {
				if (driver.switchTo().window(id).getTitle().contentEquals(actualtitle)) {
					break;
		}
		}
		}
	//thread.sleep
		public static void sleep(int seconds) throws InterruptedException {
			Thread.sleep(seconds);
		}
}