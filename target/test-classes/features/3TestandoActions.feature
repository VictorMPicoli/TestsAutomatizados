#language: pt
#encoding: UTF-8


Funcionalidade: Testar Actions



 @TesteDropdown
 Cenário: verificar dropdown da aba
 
 Quando acionar a aba pim
 E clicar no dropdown configuration
 E clicar na opção custom fields
 E clicar no botao add
 E inserir no campo field name "A1_Teste"
 E clicar no dropdown screen
 E selecionar personal details
 E clicar no dropdown type
 E selecionar text or number
 E clicar no botao save
 Então o sistema cria custom field "A1_Teste"
 