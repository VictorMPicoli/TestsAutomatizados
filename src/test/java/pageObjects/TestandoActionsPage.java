package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TestandoActionsPage {

	Actions acao = new Actions(driver);

	@FindBy(linkText = "PIM")
	public WebElement abaPim;

	@FindBy(xpath = ("//span[@class='oxd-topbar-body-nav-tab-item']"))
	public WebElement drpdwnConfiguration;

	@FindBy(linkText = "Custom Fields")
	public WebElement botaoCustomFields;

	@FindBy(xpath = ("//i[@class='oxd-icon bi-plus oxd-button-icon']"))
	public WebElement botaoAdd;

	@FindBy(xpath = ("(//input[@class='oxd-input oxd-input--active'])[2]"))
	public WebElement campoFieldName;

	@FindBy(xpath = ("(//div[@class='oxd-select-text-input'])[1]"))
	public WebElement drpdwnScreen;

	@FindBy(xpath = ("(//div[@class='oxd-select-text-input'])[2]"))
	public WebElement drpdwnType;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement botaoSave;

	@FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell'])[1]")
	public WebElement verificarField;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	public WebElement excluirField;

	@FindBy(xpath = "//i[@class='oxd-icon bi-trash oxd-button-icon']")
	public WebElement confirmarExcluirField;

	public void acionarAbaPim() {

		abaPim.click();

	}

	public void drpdwnConfiguration() {
		drpdwnConfiguration.click();
	}

	public void acionarCustomFields() {
		botaoCustomFields.click();
	}

	public void botaoAdd() {
		botaoAdd.click();
	}

	public void campoFieldName(String fieldName) {

		campoFieldName.sendKeys(fieldName);

	}

	public void drpdwnScreen() {
		drpdwnScreen.click();

	}

	public void selecaoScreen() {

		acao.moveToElement(drpdwnScreen, 0, 90).click().build().perform();
	}

	public void drpdwnType() {
		drpdwnType.click();

	}

	public void selecaoType() {
		acao.moveToElement(drpdwnType, 0, 90).click().build().perform();

	}

	public void botaoSave() {
		botaoSave.click();
	}

	public void verificarField() throws InterruptedException {

		acao.pause(1000);
		verificarField.isDisplayed();

	}

	public void excluirField() {

		excluirField.click();

	}

	public void confirmarExcluirField() {

		confirmarExcluirField.click();
	}

}
