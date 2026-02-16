# Projeto de Automação com Cucumber, Gherkin e Selenium

Este projeto demonstra o uso de BDD (Behavior-Driven Development) com Cucumber, Gherkin e Selenium para automatizar testes de interface de usuário.

## Tecnologias Utilizadas

*   **Java:** Linguagem de programação principal.
*   **Maven:** Ferramenta de gerenciamento de dependências e build.
*   **Cucumber:** Ferramenta de BDD que permite escrever testes em linguagem natural (Gherkin).
*   **Gherkin:** Linguagem utilizada para escrever os cenários de teste em arquivos `.feature`.
*   **Selenium WebDriver:** Ferramenta para automação de navegadores web.
*   **JUnit 5:** Framework de testes para execução dos testes do Cucumber.

## Estrutura do Projeto

*   `src/test/resources/features`: Contém os arquivos de feature escritos em Gherkin.
    *   `inserir_conta.feature`: Exemplo de cenário de teste para cadastro de contas.
*   `src/test/java/br/com/luciano/steps`: Contém as classes com as definições de passo (step definitions) que implementam os cenários de teste.
*   `src/test/java/br/com/luciano/runners`: Contém as classes para executar os testes do Cucumber.
*   `pom.xml`: Arquivo de configuração do Maven com todas as dependências do projeto.

## Como Executar os Testes

Para executar os testes, utilize o seguinte comando Maven na raiz do projeto:

```bash
mvn test
```
