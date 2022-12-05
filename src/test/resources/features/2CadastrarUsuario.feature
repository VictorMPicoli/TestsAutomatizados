#language: pt
#encoding: UTF-8


Funcionalidade: Cadastrar usuario



 @Cadastro
 Cenário: cadastrar usuario
 
 Quando acionar a aba admin
 E clicar o botao add
 E clicar UserRole
 E clicar botao ess
 E informar no campo employee name "Odis Adal"
 E clicar Status
 E clicar botao enabled
 E informar no campo username "1A_Teste"
 E informar no campo password "Senha_Teste1"
 E informar no campo confirm password "Senha_Teste1"
 E clicar no botao Save
 Entao o sistema cadastra o usuario "1A_Teste"
 
 