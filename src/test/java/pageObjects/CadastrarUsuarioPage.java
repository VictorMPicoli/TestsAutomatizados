package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	Actions acao = new Actions(driver);
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	public WebElement botaoAdd;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	public WebElement botaoUserRole;

	@FindBy(xpath = "//div[contains(.,'ESS')]")
	public WebElement clicarESS;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement campoEmployeeName;

	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	public WebElement botaoStatus;

	@FindBy(xpath = "//div[contains(.,'Enabled')]")
	public WebElement clicarEnabled;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement campoUsername;

	@FindBy(xpath = "(//input[@autocomplete='off'])[2]")
	public WebElement campoPassword;

	@FindBy(xpath = "(//input[@autocomplete='off'])[3]")
	public WebElement campoConfirmPassword;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement botaoSalvar;

	@FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell'])[1]")
	public WebElement confirmarCadastro;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	public WebElement excluirCadastro;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement confirmaExcluirCadastro;

	public void acionarBotaoAdd() {

		botaoAdd.click();

	}

	public void clicarUserRole() {
		botaoUserRole.click();

	}

	public void clicarESS() {

		acao.moveToElement(botaoUserRole, 0, 50).click().build().perform();
	}

	public void informarCampoEmployeeName(String employeeName) {
		campoEmployeeName.sendKeys(employeeName);
		acao.moveToElement(campoEmployeeName, 0, 50).pause(2000).click().build().perform();

	}

	public void botaoStatus() {
		botaoStatus.click();
	}

	public void clicarEnabled() {
		acao.moveToElement(botaoStatus, 0, 100).click().build().perform();

	}

	public void campoUsername(String username) {

		campoUsername.sendKeys(username);

	}

	public void informarcampoPassword(String senha) {
		campoPassword.sendKeys(senha);
	}

	public void informarcampoConfirmPassword(String senha) {
		acao.pause(1000).build().perform();
		campoConfirmPassword.sendKeys(senha);
	}

	public void acionarBotaoSalvar() {

		botaoSalvar.click();
	}

	public void confirmarCadastro() {
		acao.pause(1500).build().perform();
		confirmarCadastro.isDisplayed();

	}

	public void excluirCadastro() {

		excluirCadastro.click();
	}

	public void confirmaExcluirCadastro() {

		confirmaExcluirCadastro.click();
	}

}