package br.com.luciano.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private final WebDriver driver;

    @FindBy(id = "email")
    private WebElement campoEmail;

    @FindBy(id = "senha")
    private WebElement campoSenha;

    @FindBy(css = "button[type='submit']")
    private WebElement botaoEntrar;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void realizarLogin(String email, String senha){
        campoEmail.sendKeys(email);
        campoSenha.sendKeys(senha);
        botaoEntrar.click();
    }
}
