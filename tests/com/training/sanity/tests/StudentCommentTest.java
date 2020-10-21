package com.training.sanity.tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.training.pom.StudentCommentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class StudentCommentTest {
	private WebDriver driver;
	private String baseUrl;
	private StudentCommentPOM pom;
	private static Properties properties;
	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		pom = new StudentCommentPOM(driver); 
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
		pom.sendUserName("panda");
		pom.sendPassword("panda@123");
		pom.clickLoginBtn(); 
		pom.clickCourseCatalog();
		pom.enterCourseName("courseforpanda");
		pom.search();
		pom.courseLink();
		pom.courseHome();
		pom.projectLink();
		pom.taskLink();
		}

}
