package com.floward;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,30 );
	}

	public void selectCountry(String countryName) {

		wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='"+countryName+"']"))).click();

	}




}
