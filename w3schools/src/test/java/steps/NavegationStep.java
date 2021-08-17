package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.NavegationPage;

public class NavegationStep {
	private NavegationPage navegationPage;

	public NavegationStep() {
		navegationPage = new NavegationPage(BaseTest.driver);
	}

	@Dado("que eu acesse a url {string}")
	public void que_eu_acesse_a_url(String url) throws Exception {
		navegationPage.acessarUrl(url);

	}

	@E("navegue pelo menu principal em Tutorials >> Learn How To")
	public void navegue_pelo_menu_principal_em_tutorials_learn_how_to() throws Exception {
		navegationPage.acessarMenu();

	}

	@Dado("navegue pelo menu lateral em More >> Modal Boxes")
	public void navegue_pelo_menu_lateral_em_more_modal_boxes() throws Exception {
		navegationPage.acessarMenuLateral();

	}

	@Quando("clico em Open modal")
	public void clico_em_open_modal() throws Exception {
		navegationPage.clicarOpenModal();

	}

	@Então("Modal ficará visível")
	public void modal_ficará_visível() throws Exception {
		navegationPage.validarModalOprenModal();

	}

	///////////////////////////////////

	@Quando("clico em fechar o modal")
	public void clico_em_fechar_o_modal() throws Exception {
		navegationPage.fecharModal();
		

	}

	@Então("Modal não ficará mais visível")
	public void modal_não_ficará_mais_visível() throws Exception {
		navegationPage.validarFechamentoModalOprenModal();

	}
}
