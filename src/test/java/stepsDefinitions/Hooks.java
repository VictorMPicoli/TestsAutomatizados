package stepsDefinitions;

import static utils.Utils.Na;
import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;
import static utils.Utils.driver;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.LoginPage;
import pageObjects.TestandoActionsPage;

public class Hooks {

	@Before(value = "@Login" )
	public void setUp() {

		acessarSistema();

	}

	@Before(value = "@Cadastro")

	public void funcionalidadeLogin() {

		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}

	@Before(value = "@TesteDropdown")
	public void funcionalidadeLogin1() {

		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}

	@After(value = "@TesteDropdown")
	public void funcionalidadeExcluirField(Scenario scenario) {
		Actions acao = new Actions(driver);
		capturarTela(scenario);
		Na(TestandoActionsPage.class).excluirField();
		Na(TestandoActionsPage.class).confirmarExcluirField();
		acao.pause(5000).build().perform();
		capturarTela(scenario);
		driver.quit();

	}

	@After(value = "@Cadastro")
	public void funcionalidadeExcluirCadastro(Scenario scenario) {
		Actions acao = new Actions(driver);
		capturarTela(scenario);
		Na(CadastrarUsuarioPage.class).excluirCadastro();
		Na(CadastrarUsuarioPage.class).confirmaExcluirCadastro();
		acao.pause(4500).build().perform();
		capturarTela(scenario);
		driver.quit();

	}

	@After(value = "@Login")
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		//driver.quit();
	}

}
