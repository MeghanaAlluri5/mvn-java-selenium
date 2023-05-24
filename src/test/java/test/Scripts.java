package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scripts {

	WebDriver driver;

	@BeforeMethod
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://thg-greenair.dev.wgv.onpier.de/onboarding");

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

	@Test(priority = 0)
	public void testCase_e2eFlow() throws InterruptedException {
		
		Libs objLib = new Libs();

		objLib.applyforEVhecile(driver);

		objLib.uploadDocuments(driver);

		objLib.fillCustomerDetails_PrivatePerson(driver);

		objLib.acceptConcern(driver);

	}

	
	@Test(priority = 1)
	public void testCase_e2eFlow2() throws InterruptedException {
		
		Libs objLib = new Libs();

		objLib.applyforEVhecile(driver);

		objLib.uploadDocuments(driver);

		objLib.fillCustomerDetails_Unternehmen(driver);

		objLib.acceptConcern(driver);

	}

	
	@Test(priority = 2)
	public void testCase_tooltipValidation() throws InterruptedException {
		
		Libs objLib = new Libs();

		objLib.applyforEVhecile(driver);

		objLib.uploadDocuments(driver);
		
		
		objLib.validateTooltip(driver);
		
		



	}

	

	@AfterMethod
	public void closeBrowser() {

		driver.quit();

	}

}
