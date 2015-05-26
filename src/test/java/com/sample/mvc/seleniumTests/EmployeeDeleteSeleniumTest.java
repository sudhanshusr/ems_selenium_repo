package com.sample.mvc.seleniumTests;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeDeleteSeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://172.27.59.118:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/list";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEdit() throws Exception {
	  driver.get("http://localhost:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/list");
	    //assertEquals("Employee List", driver.getTitle());
	    driver.findElement(By.xpath("(//a[contains(text(),'delete')])[2]")).click();
	    //assertEquals("Employee List", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
   
  }

 
}
 