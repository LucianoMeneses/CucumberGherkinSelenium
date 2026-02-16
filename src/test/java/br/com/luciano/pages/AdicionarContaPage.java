package br.com.luciano.pages;

import br.com.luciano.utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdicionarContaPage {

    private final WebDriver driver;

    @FindBy(id = "nome")
    private WebElement campoNome;

    @FindBy(css = "button[type='submit']")
    private WebElement botaoSalvar;

    @FindBy(css = ".alert")
    private WebElement mensagemAlerta;

    public AdicionarContaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void adicionarConta(String nomeConta){

        if (nomeConta.equalsIgnoreCase("Conta de testes")){
            nomeConta = nomeConta +" "+ Utils.gerarStringAleatoria();
        }

        campoNome.sendKeys(nomeConta);
        botaoSalvar.click();
    }

    public void verificarMensagemDeAlerta(String mensagem){
        Assertions.assertEquals(mensagem, mensagemAlerta.getText());
    }
}
