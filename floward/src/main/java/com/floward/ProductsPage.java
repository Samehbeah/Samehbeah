package com.floward;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {



	WebDriver driver;
	WebDriverWait wait;
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	public void selectCategory(String categoryName) {

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='" +categoryName+" ']"))).click();



	}


	public void selectProduct(String productName) {

		WebElement productLabel = driver.findElement(By.xpath("//*[text()=' "+productName+"']"));

		Actions action = new Actions(driver);

		action.moveToElement(productLabel).perform();

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()=' "+productName+"']//following::div)[2]//button"))).click();


	}
	
	public void continueToCartPage() {
		
		
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=' Continue ']"))).click();
		
		
		
	}



}
