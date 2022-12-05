package stepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.TestandoActionsPage;

public class TestandoActionSteps {

	@Quando("acionar a aba pim")
	public void acionarAbaPim() {

		Na(BasePage.class).acionarAbaPim();
	}

	@Quando("clicar no dropdown configuration")
	public void clicarNoDropdownConfiguration() {
		Na(TestandoActionsPage.class).drpdwnConfiguration();
	}

	@Quando("clicar na opção custom fields")
	public void clicarNaOpçãoCustomFields() {
		Na(TestandoActionsPage.class).acionarCustomFields();
	}

	@Quando("clicar no botao add")
	public void clicarNoBotaoAdd() {
		Na(TestandoActionsPage.class).botaoAdd();
	}

	@Quando("inserir no campo field name {string}")
	public void inserirNoCampoFieldName(String string) {
		Na(TestandoActionsPage.class).campoFieldName(string);
	}

	@Quando("clicar no dropdown screen")
	public void clicarNoDropdownScreen() {
		Na(TestandoActionsPage.class).drpdwnScreen();
	}

	@Quando("selecionar personal details")
	public void selecionarPersonalDetails() {
		Na(TestandoActionsPage.class).selecaoScreen();

	}

	@Quando("clicar no dropdown type")
	public void clicarNoDropdownType() {
		Na(TestandoActionsPage.class).drpdwnType();
	}

	@Quando("selecionar text or number")
	public void selecionarTextOrNumber() {
		Na(TestandoActionsPage.class).selecaoType();
	}

	@Quando("clicar no botao save")
	public void clicarNoBotaoSave() {
		Na(TestandoActionsPage.class).botaoSave();
	}

	@Então("^o sistema cria custom field \"([^\"]*)\"$")
	public void oSistemaCriaCustomField(String arg1) throws Throwable {
		Na(TestandoActionsPage.class).verificarField();
	}

}
