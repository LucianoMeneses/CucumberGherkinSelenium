package br.com.luciano.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    @FindBy(linkText = "Contas")
    private WebElement linkContas;

    @FindBy(linkText = "Adicionar")
    private WebElement linkAdicionar;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acessarTelaDeAdicionarConta(){
        linkContas.click();
        linkAdicionar.click();
    }
}
