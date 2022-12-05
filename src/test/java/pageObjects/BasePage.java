package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

	@FindBy(linkText = "Admin")
	public WebElement abaAdmin;

	@FindBy(linkText = "PIM")
	public WebElement abaPim;

	public void acionarAbaAdmin() {
		abaAdmin.click();
	}

	public void acionarAbaPim() {

		abaPim.click();

	}

}
