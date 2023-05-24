package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Libs {
	
	

	public void acceptConcern(WebDriver driver) {
		List<WebElement> checkBoxElement = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement webElement : checkBoxElement) {

			webElement.click();

		}
		WebElement elementComplete = driver.findElement(By.xpath("//*[text()='Jetzt Prämie beantragen ']"));

		elementComplete.click();

		WebElement thankyou = driver.findElement(By.xpath("//*[text()='Vielen Dank!']"));

		Assert.assertTrue(thankyou.isDisplayed());
	}

	public void fillCustomerDetails_PrivatePerson(WebDriver driver) throws InterruptedException {
		WebElement genderDropDwon = driver.findElement(By.xpath("//*[@id='mat-select-value-1']"));

		genderDropDwon.click();

		Thread.sleep(3000);

		WebElement selectDivers = driver.findElement(By.xpath("//mat-option[@id='mat-option-2']//span"));

		selectDivers.click();

		WebElement eleMax = driver.findElement(By.xpath("//input[@placeholder='Max']"));

		eleMax.sendKeys("TestfirstName");

		WebElement eleMustermann = driver.findElement(By.xpath("//input[@placeholder='Mustermann']"));

		eleMustermann.sendKeys("TestLastName");

		WebElement eleEmail = driver.findElement(By.xpath("//input[@placeholder='max.mustermann@muster.de']"));

		eleEmail.sendKeys("TestfirstName@gmail.com");

		WebElement eleMaxMusterman = driver.findElement(By.xpath("//input[@placeholder='Max Mustermann']"));

		eleMaxMusterman.sendKeys("TestfirstName TestLastName");

		WebElement eleMIBan = driver.findElement(By.xpath("//input[@placeholder='z.B. DE45 7890 8965 5643 3454 00']"));

		eleMIBan.sendKeys("ZBD7 3737 3773 733");

		WebElement eleFurther2 = driver.findElement(By.xpath("(//*[text()='Weiter '])[2]"));

		eleFurther2.click();
	}

	public void fillCustomerDetails_Unternehmen(WebDriver driver) throws InterruptedException {

		WebElement selectUnternehmenRaidoButton = driver.findElement(By.xpath("//*[@id='mat-radio-3-input']"));
		selectUnternehmenRaidoButton.click();

		WebElement eleMuCompany = driver.findElement(By.xpath("//input[@placeholder='Musterunternehmen GmbH']"));

		eleMuCompany.sendKeys("TestLastName Company");

		WebElement eleMuCompanyID = driver.findElement(By.xpath("//input[@placeholder='z.B. DE123456789']"));

		eleMuCompanyID.sendKeys("DE123456789");

		WebElement genderDropDwon = driver.findElement(By.xpath("//*[@id='mat-select-value-1']"));

		genderDropDwon.click();

		Thread.sleep(3000);

		WebElement selectDivers = driver.findElement(By.xpath("//mat-option[@id='mat-option-2']//span"));

		selectDivers.click();

		WebElement eleMax = driver.findElement(By.xpath("//input[@placeholder='Max']"));

		eleMax.sendKeys("TestfirstName");

		WebElement eleMustermann = driver.findElement(By.xpath("//input[@placeholder='Mustermann']"));

		eleMustermann.sendKeys("TestLastName");

		WebElement eleEmail = driver.findElement(By.xpath("//input[@placeholder='max.mustermann@muster.de']"));

		eleEmail.sendKeys("TestfirstName@gmail.com");

		WebElement eleMaxMusterman = driver.findElement(By.xpath("//input[@placeholder='Max Mustermann']"));

		eleMaxMusterman.sendKeys("TestfirstName TestLastName");

		WebElement eleMIBan = driver.findElement(By.xpath("//input[@placeholder='z.B. DE45 7890 8965 5643 3454 00']"));

		eleMIBan.sendKeys("ZBD7 3737 3773 733 3");

		WebElement eleFurther2 = driver.findElement(By.xpath("(//*[text()='Weiter '])[2]"));

		eleFurther2.click();
	}

	public void uploadDocuments(WebDriver driver) {
		WebElement eleFileFront = driver.findElement(By.xpath("(//input[@type='file'])[1]"));

		eleFileFront
				.sendKeys(System.getProperty("user.dir")+"/src/test/resources/files/file1.jpeg");

		WebElement eleFileback = driver.findElement(By.xpath("(//input[@type='file'])[1]"));

		eleFileback
				.sendKeys(System.getProperty("user.dir")+"/src/test/resources/files/file1.jpeg");

		WebElement eleFurther = driver.findElement(By.xpath("(//*[text()='Weiter '])[1]"));

		eleFurther.click();
	}

	public void applyforEVhecile(WebDriver driver) {
		WebElement eleFahrzeugklassen = driver.findElement(By.xpath("(//*[text()='Fahrzeugklassen'])[1]"));

		eleFahrzeugklassen.click();

		WebElement eleZweiräder = driver.findElement(By.xpath("(//*[text()=' E-Zweiräder '])[1]"));

		eleZweiräder.click();

		WebElement eleApplyNow = driver.findElement(By.cssSelector("span.mdc-button__label"));

		eleApplyNow.click();
	}

	public void validateTooltip(WebDriver driver) throws InterruptedException {
		
		WebElement selectUnternehmenRaidoButton = driver.findElement(By.xpath("//*[@id='mat-radio-3-input']"));
		selectUnternehmenRaidoButton.click();
		
		
		WebElement tootlTip = driver.findElement(By.xpath("//mat-icon[text()='info_outline ']"));
		tootlTip.click();

		Thread.sleep(3000);
		WebElement tooltipText = driver.findElement(By.xpath(
				"(//*[text()='Bitte geben Sie neben Ihrem Unternehmensnamen auch Ihre Unternehmensrechtsform an.'])[1]"));

		Assert.assertTrue(tooltipText.isDisplayed());

		WebElement tooltipText2 = driver.findElement(By.xpath("(//*[text()='Beispiel: Musterunternehmen GmbH'])[1]"));

		Assert.assertTrue(tooltipText2.isDisplayed());

	}

}
