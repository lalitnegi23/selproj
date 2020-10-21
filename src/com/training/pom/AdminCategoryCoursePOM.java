package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;;

public class AdminCategoryCoursePOM {
	
private WebDriver driver; 
	
	public AdminCategoryCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	//driver.findElement(By.partialLinkText("Administration")).click();
	@FindBy(partialLinkText="Administration")
	private WebElement adminTab;
	
	//driver.findElement(By.partialLinkText("Courses categories")).click();
	@FindBy(partialLinkText="Courses categories")
	private WebElement categoryLink;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/a/img")
	private WebElement addCategory;
	
	//course_category_code
	@FindBy(id="course_category_code")
	private WebElement categoryText;
	
	@FindBy(id="course_category_name")
	private WebElement categoryName;
	
	@FindBy(xpath="/html/body/main/section/div/form/fieldset/div[3]/div[1]/div[1]/label/input")
	private WebElement radio;
	
	@FindBy(id="course_category_submit")
	private WebElement submitbtn;
	//driver.findElement(By.partialLinkText("")).click();
	@FindBy(partialLinkText="Create a course")
	private WebElement createCourse;
	
	@FindBy(id="update_course_title")
	private WebElement createCourseText;
	
	@FindBy(id="visual_code")
	private WebElement createCodeText;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[3]/div[1]/div/button/div/div/div")
	private WebElement selectCategory;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[3]/div[1]/div/div/div[2]/ul/li[9]/a/span")
	private WebElement selectACategory;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[7]/div[1]/div/button/div/div/div")
	private WebElement selectLang;
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[7]/div[1]/div/div/div[2]/ul/li[6]/a/span")
	private WebElement selectALang;
	
	@FindBy(id="update_course_submit")
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
	
	public void clickCategoryLink() {
		this.categoryLink.click();
	}

	public void addCategory() {
		this.addCategory.click();
	}
	
	public void enterCategory(String category) {
		this.categoryText.sendKeys(category);
	}
	public void enterCategoryName(String str) {
		this.categoryName.sendKeys(str);
	}
	public void clickRadio() {
		this.radio.click();
	}
	public void clickSubmit() {
		this.submitbtn.click();
	}
	public void clickCreateACourse() {
		this.createCourse.click();
	}
	public void enterCourseText(String course) {
		this.createCourseText.sendKeys(course);
	}
	public void enterCodeText(String code) {
		this.createCodeText.sendKeys(code);
	}
	
	public void selectCategory(){
		this.selectCategory.click();
	}
	
	public void selectACategory(){
		this.selectACategory.click();
	}
	public void selectLang(){
		this.selectLang.click();
	}
	
	public void selectALang(){
		this.selectALang.click();
	}
	public void submit(){
		this.submit.click();
	}
	
	

}
