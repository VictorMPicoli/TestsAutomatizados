#language: pt
#encoding: UTF-8

@Login
Funcionalidade: Login


 @loginSucesso
 Cenário: Realizar login
 Quando eu informar o usuario "Admin"
 E informar a senha "admin123"
 E clicar no botão login
 Entao o sistema exibe o usuario logado
 
 @loginInvalido
Cenário: informacoes invalidas
 Quando eu informar o usuario ""
 E informar a senha ""
 E clicar no botão login
 Entao o sistema exibe a mensagem de usuario e senha invalidos
 
 
 @usuarioInvalido
 Cenário: Usuario Invalido
 Quando eu informar o usuario ""
 E informar a senha "admin123"
 E clicar no botão login
 Entao o sistema exibe mensagem de usuario invalido
 
 
 @senhaInvalida
 Cenário: Senha Invalida
 Quando eu informar o usuario "Admin"
 E informar a senha ""
 E clicar no botão login
 Entao o sistema exibe mensagem de senha invalida
 