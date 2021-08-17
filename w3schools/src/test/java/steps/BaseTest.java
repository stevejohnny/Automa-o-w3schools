package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {
	public static WebDriver driver;

	@Before
	public void before() {
		System.out.println("<=== cenario iniciado");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// "C:/Users/steve.silva/eclipse-workspace/CursoCucumberOri/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		options.addArguments("--start-maximized");

	}

	@After
	public void after() {
		try {
			driver.close();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
