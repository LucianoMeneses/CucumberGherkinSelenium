package br.com.luciano.steps;

import br.com.luciano.pages.AdicionarContaPage;
import br.com.luciano.pages.HomePage;
import br.com.luciano.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class InserirContasSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private AdicionarContaPage adicionarContaPage;

    @Before
    public void inicializar() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @After
    public void finalizar() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Dado("acesso a tela de login do sistema e informo o usuário {string} e senha {string} e clico em entrar")
    public void informo_o_usuário_e_senha_e_clico_em_entrar(String usuario, String senha) {
        driver.get("https://seubarriga.wcaquino.me/login");
        loginPage = new LoginPage(driver);
        loginPage.realizarLogin(usuario, senha);
    }

    @Quando("acesso a tela de adicionar conta e informo o nome da conta {string} e clico em Salvar")
    public void adicionar_conta(String nomeConta) {
        homePage = new HomePage(driver);
        adicionarContaPage = new AdicionarContaPage(driver);
        homePage.acessarTelaDeAdicionarConta();
        adicionarContaPage.adicionarConta(nomeConta);
    }
    @Entao("recebo a mensagem {string}")
    public void verificar_mensagem_exibida(String mensagem) {
        adicionarContaPage.verificarMensagemDeAlerta(mensagem);
    }
}
