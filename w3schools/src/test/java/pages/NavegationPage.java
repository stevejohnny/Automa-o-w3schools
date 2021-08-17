package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.NavegationMaps;

public class NavegationPage extends BasePage {

	private NavegationMaps navegationMaps;

	public NavegationPage(WebDriver driver) {
		super(driver);
		navegationMaps = new NavegationMaps(driver);
	}

	public void acessarUrl(String url) throws Exception {
		System.out.println("Navegando para a url");
		navigateTo(url);
	}

	public void acessarMenu() throws Exception {
		System.out.println("acessando menu");
		click(navegationMaps.menuTutorials());
		click(navegationMaps.submenuLearnHowTo());

	}

	public void acessarMenuLateral() {
		System.out.println("acessando menu lateral");
		click(navegationMaps.submenuModalBoxes());

	}

	public void clicarOpenModal() {
		System.out.println("acessando menu lateral");
		click(navegationMaps.buttonOpenModal());

	}

	public void validarModalOprenModal() {
		System.out.println("Validando visibilidade do modal");
		WebElement varModal = navegationMaps.modalOpenModal();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(varModal));
	}

	public void fecharModal() {
		System.out.println("fechando o modal");
		click(navegationMaps.buttonCloseModal());	
		
	}
	
	public void validarFechamentoModalOprenModal() {
		System.out.println("Validando a NÃO visibilidade do modal");
		WebElement varModal = navegationMaps.modalOpenModal();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.invisibilityOf(varModal));
	}

}
