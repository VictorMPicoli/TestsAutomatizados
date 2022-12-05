package stepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.CadastrarUsuarioPage;

public class CadastrarUsuarioSteps {

	@Quando("acionar a aba admin")
	public void acionar_a_aba_admin() {

		Na(BasePage.class).acionarAbaAdmin();

	}

	@Quando("clicar o botao add")
	public void clicar_o_botao_add() {

		Na(CadastrarUsuarioPage.class).acionarBotaoAdd();
	}

	@Quando("clicar UserRole")
	public void clicar_UserRole() {

		Na(CadastrarUsuarioPage.class).clicarUserRole();

	}

	@E("^clicar botao ess$")
	public void clicar_botao_ess() throws Throwable {
		Na(CadastrarUsuarioPage.class).clicarESS();
	}

	@Quando("informar no campo employee name {string}")
	public void informar_no_campo_employee_name(String employeeName) throws Throwable {
		Na(CadastrarUsuarioPage.class).informarCampoEmployeeName(employeeName);
	}

	@Quando("clicar Status")
	public void clicar_Status() {
		Na(CadastrarUsuarioPage.class).botaoStatus();
	}

	@Quando("clicar botao enabled")
	public void clicar_botao_enabled() {
		Na(CadastrarUsuarioPage.class).clicarEnabled();
	}

	@Quando("informar no campo username {string}")
	public void informar_no_campo_username(String username) {
		Na(CadastrarUsuarioPage.class).campoUsername(username);
	}

	@Quando("informar no campo password {string}")
	public void informar_no_campo_password(String string) {
		Na(CadastrarUsuarioPage.class).informarcampoPassword(string);
	}

	@Quando("informar no campo confirm password {string}")
	public void informar_no_campo_confirm_password(String senha) {
		Na(CadastrarUsuarioPage.class).informarcampoConfirmPassword(senha);
	}

	@E("^clicar no botao Save$")
	public void clicarNoBotaoSave() throws Throwable {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String username) throws Throwable {

		Na(CadastrarUsuarioPage.class).confirmarCadastro();

	}

}