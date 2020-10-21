package com.training.sanity.tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminCategoryCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class AdminCategoryCourseTest {
	
	private WebDriver driver;
	private String baseUrl;
	private AdminCategoryCoursePOM pom;
	private static Properties properties;
	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		pom = new AdminCategoryCoursePOM(driver); 
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
		pom.clickCategoryLink();
		pom.addCategory();
		pom.enterCategory("BL");
		pom.enterCategoryName("Blended Learning");
		pom.clickRadio();
		pom.clickSubmit();
		pom.clickAdminTab();
		pom.clickCreateACourse();
		pom.enterCourseText("testing");
		pom.enterCodeText("tes");
		pom.selectCategory();
		pom.selectACategory();
		pom.selectLang();
		pom.selectALang();
		pom.submit();
	}

}
