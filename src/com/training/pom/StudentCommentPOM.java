package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentCommentPOM {
	private WebDriver driver; 
	
	public StudentCommentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn;
	
	@FindBy(linkText="Course catalog")
	private WebElement courseCatalog;
	
	@FindBy(name="search_term")
	private WebElement courseName;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/div/button")
	private WebElement search;
	
	@FindBy(partialLinkText="courseforpanda")
	private WebElement courseLink;
	
	@FindBy(partialLinkText="Course home")
	private WebElement courseHome;
	
	@FindBy(linkText="projectforpanda")
	private WebElement projectLink;
	
	@FindBy(linkText="taskforpanda")
	private WebElement taskLink;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickCourseCatalog() {
		this.courseCatalog.click(); 
	}
	
	public void enterCourseName(String str) {
		this.courseName.sendKeys(str);; 
	}
	public void search() {
		this.search.click(); 
	}
	public void courseLink() {
		this.courseLink.click(); 
	}
	public void courseHome() {
		this.courseHome.click(); 
	}
	public void projectLink() {
		this.projectLink.click(); 
	}
	public void taskLink() {
		this.taskLink.click(); 
	}
	
	

}
