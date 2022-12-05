package stepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);

	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botão login")
	public void clicarNoBotãoLogin() {
		Na(LoginPage.class).BotaoLogin();
	}

	@Entao("o sistema exibe o usuario logado")

	public void oSistemaExibeOUsuarioLogado() {
		Na(LoginPage.class).loginValido();
	}

	@Entao("^o sistema exibe a mensagem de usuario e senha invalidos$")
	public void oSistemaExibeAMensagemDeUsuarioESenhaInvalidos() throws Throwable {
		Na(LoginPage.class).loginInvalido();
	}

	@Entao("^o sistema exibe mensagem de usuario invalido$")
	public void oSistemaExibeMensagemDeUsuarioInvalido() throws Throwable {
		Na(LoginPage.class).usuarioInvalido();
	}

	@Entao("^o sistema exibe mensagem de senha invalida$")
	public void oSistemaExibeMensagemDeSenhaInvalida() throws Throwable {
		Na(LoginPage.class).senhaInvalida();
	}

}
