package com.training.sanity.tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.AdminCategoryCoursePOM;
import com.training.pom.AdminCreateAUserPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AdminCreateAUserTest {
	private WebDriver driver;
	private String baseUrl;
	private AdminCreateAUserPOM pom;
	private static Properties properties;
	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		pom = new AdminCreateAUserPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void validate() {
		pom.sendUserName("admin");
		pom.sendPassword("admin@123");
		pom.clickLoginBtn();
		pom.clickAdminTab();
		pom.addUserLink();
		pom.firstnameText("manzoor");
		pom.lastnameText("mehadi");
		pom.emailText("manzoor@gmail.com");
		pom.phoneText("9876543210");
		pom.usernameText("manzoor");
		pom.passwordRadio();
		pom.passwordText("manzoor");
		pom.selectProfile();
		pom.selectAProfile();
		pom.submitUser();
		pom.clickAdminTab();
		pom.addUserToCourse();
		pom.selectUserList("442");
		pom.selectCourseList("COURSEFORPANDA");
		pom.submit();
		
	}

}
