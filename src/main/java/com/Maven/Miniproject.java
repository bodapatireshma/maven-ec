package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Miniproject {

public static WebDriver driver;
	
	public Miniproject(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement signin;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement tshirts;
	
	@FindBy(xpath = "(//img[@title='Faded Short Sleeve T-shirts'])[1]")
	private WebElement image;
	
	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement quickView;
	
	@FindBy(xpath = "//input[@id='quantity_wanted']")
	private WebElement quantity;
	
	@FindBy(xpath = "//input[@id='quantity_wanted']")
	private WebElement quantity1;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//a[@id='color_14']")
	private WebElement pinkclr;
	
	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addCart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed1;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement txtBox;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement proceed2;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement tickBox;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement proceed3;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getTshirts() {
		return tshirts;
	}
	public WebElement getImage() {
		return image;
	}
	public WebElement getQuickView() {
		return quickView;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getQuantity1() {
		return quantity1;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getPinkclr() {
		return pinkclr;
	}
	public WebElement getAddCart() {
		return addCart;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getProceed1() {
		return proceed1;
	}
	public WebElement getTxtBox() {
		return txtBox;
	}
	public WebElement getProceed2() {
		return proceed2;
	}
	public WebElement getTickBox() {
		return tickBox;
	}
	public WebElement getProceed3() {
		return proceed3;
	}
	public WebElement getBank() {
		return bank;
	}
	public WebElement getConfirm() {
		return confirm;
	}
}