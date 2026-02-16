#language: pt
Funcionalidade: Cadastro de contas

  Como um usuário
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Esquema do Cenario: Deve validar regras de cadastro de contas
    Dado acesso a tela de login do sistema e informo o usuário "<usuario>" e senha "<senha>" e clico em entrar
    Quando acesso a tela de adicionar conta e informo o nome da conta "<nomeconta>" e clico em Salvar
    Entao recebo a mensagem "<mensagem>"

    Exemplos:
    |       usuario        |  senha   |     nomeconta    |            mensagem                |
    | luciano621@gmail.com |  luciano | Conta de testes  | Conta adicionada com sucesso!      |
    | luciano621@gmail.com |  luciano |                  | Informe o nome da conta           |
    | luciano621@gmail.com |  luciano | Conta mesmo nome | Já existe uma conta com esse nome! |

