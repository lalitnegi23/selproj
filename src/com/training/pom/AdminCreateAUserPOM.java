package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminCreateAUserPOM {
private WebDriver driver; 
	
	public AdminCreateAUserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(partialLinkText="Administration")
	private WebElement adminTab;
	
	@FindBy(partialLinkText="Add a user")
	private WebElement addUserLink;
	
	@FindBy(id="firstname")
	private WebElement firstnameText;
	
	@FindBy(id="lastname")
	private WebElement lastnameText;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="/html/body/main/section/div/div[2]/div/section/form/fieldset/div[9]/div[1]/div[2]/label/input")
	private WebElement passwordRadio;
	
	@FindBy(id="password")
	private WebElement passwordText;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/button/div/div/div")
	private WebElement selectProfile;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[1]/a/span")
	private WebElement selectAProfile;
	
	@FindBy(name="submit")
	private WebElement submitUser;
	
	@FindBy(partialLinkText="Add users to course")
	private WebElement addUserToCourse;
	
	@FindBy(name="UserList[]")
	private WebElement userlist;
	
	@FindBy(name="CourseList[]")
	private WebElement courselist;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/form[2]/table/tbody/tr[2]/td[2]/button")
	private WebElement submit;
	
	
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
	
	public void clickAdminTab() {
		this.adminTab.click();
	}
	
	public void addUserLink() {
		this.addUserLink.click();
	}
	
	public void firstnameText(String firstname) { 
		this.firstnameText.sendKeys(firstname); 
	}
	public void lastnameText(String lastname) { 
		this.lastnameText.sendKeys(lastname); 
	}
	public void emailText(String email) { 
		this.email.sendKeys(email); 
	}
	public void phoneText(String phone) { 
		this.phone.sendKeys(phone); 
	}
	public void usernameText(String username) { 
		this.username.sendKeys(username); 
	}
	public void passwordRadio(){
		this.passwordRadio.click();
	}
	
	public void passwordText(String password) { 
		this.passwordText.sendKeys(password); 
	}
	public void selectProfile(){
		this.selectProfile.click();
	}
	
	public void selectAProfile(){
		this.selectAProfile.click();
	}
	public void submitUser(){
		this.submitUser.click();
	}
	public void addUserToCourse() {
		this.addUserToCourse.click();
	}
	public void selectUserList(String user) {
		Select userList = new Select(this.userlist);
		userList.selectByValue(user);
	}
	
	public void selectCourseList(String course) {
		Select courseList = new Select(this.courselist);
		courseList.selectByValue(course);
	}
	
	public void submit(){
		this.submit.click();
	}
	
}
