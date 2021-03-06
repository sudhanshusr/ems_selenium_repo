package com.sample.mvc.seleniumTests;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeAddSeleniumTest {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://172.27.59.118:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/jsp/add.jsp";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCheck() throws Exception {
//		driver.get(baseUrl + "");
//	    driver.findElement(By.name("code")).clear();
//	    driver.findElement(By.name("code")).sendKeys("423");
//	    driver.findElement(By.name("name")).clear();
//	    driver.findElement(By.name("name")).sendKeys("Rahul");
//	    driver.findElement(By.name("city")).clear();
//	    driver.findElement(By.name("city")).sendKeys("Pune");
//	    driver.findElement(By.id("SubmitEmployee")).click();
		
		driver.get("http://localhost:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/home.html");
	    //assertEquals("Employee Application", driver.getTitle());
	    driver.findElement(By.id("AddEmployeeLink")).click();
	    //assertEquals("Employee Application", driver.getTitle());
	    driver.findElement(By.name("code")).clear();
	    driver.findElement(By.name("code")).sendKeys("01");
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("sudu");
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("kal");
	    driver.findElement(By.id("SubmitEmployee")).click();
	    //assertEquals("Employee List", driver.getTitle());

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}
