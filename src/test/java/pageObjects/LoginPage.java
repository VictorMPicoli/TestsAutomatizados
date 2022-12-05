package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "username")
	private WebElement campoUsuario;

	@FindBy(name = "password")
	private WebElement campoSenha;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement botaoLogin;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-attendance-card-state']")
	private WebElement loginValido;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement loginInvalido;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement usuarioInvalido;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement senhaInvalida;

	public void informarCampoUsuario(String usuario) {

		campoUsuario.sendKeys(usuario);

	}

	public void informarCampoSenha(String senha) {

		campoSenha.sendKeys(senha);
	}

	public void BotaoLogin() {

		botaoLogin.click();
	}

	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		botaoLogin.click();
	}

	public void loginValido() {

		loginValido.isDisplayed();
	}

	public void loginInvalido() {

		loginInvalido.isDisplayed();
	}

	public void usuarioInvalido() {

		usuarioInvalido.isDisplayed();
	}

	public void senhaInvalida() {

		senhaInvalida.isDisplayed();
	}

}
