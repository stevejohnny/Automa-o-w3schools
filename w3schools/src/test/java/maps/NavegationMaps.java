package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class NavegationMaps extends BasePage {

	public NavegationMaps(WebDriver driver) {
		super(driver);
	}

	public WebElement menuTutorials() {
		WebElement element = driver.findElement(By.xpath("//a[@id='navbtn_tutorials']"));
		return element;
	}

	public WebElement submenuLearnHowTo() {
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Learn How To']"));
		return element;
	}

	public WebElement submenuModalBoxes() {
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Modal Boxes']"));
		return element;
	}

	public WebElement buttonOpenModal() {
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Open Modal']"));
		return element;
	}

	public WebElement modalOpenModal() {
		WebElement element = driver.findElement(
				By.xpath("//div[@class='w3-modal-content w3-animate-top w3-card-4']//div[@class='w3-container']"));
		return element;
	}
	
	public WebElement buttonCloseModal() {
		WebElement element = driver.findElement(
				By.xpath("//span[@class='w3-button w3-xlarge w3-display-topright w3-hover-red w3-hover-opacity']"));
		return element;
	}
	

}
